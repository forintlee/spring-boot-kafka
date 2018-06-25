
/**
 * Copyright 2018-2025 JSST All Rights Reserved.
 */

package com.jieshun.jsis.message.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.jieshun.jsis.message.entity.park.ParkOut;
import com.jieshun.jsis.message.service.IParkOutService;

import lombok.extern.slf4j.Slf4j;

/**
 * 出场数据接收组件
 * 由于出场队列分了五个区,所有下面有启用五个消费者同时消费
 * 为确保数据不丢失,数据持久化后,采手动提交
 * @author sz_jht224
 * @since 2018年6月14日
 */
@Component
@Slf4j
public class ParkOutReceiver {

  @Autowired
  private IParkOutService parkOutService;
  
  @KafkaListener(clientIdPrefix = "parkOut-one", topics = "${kafka.consumer.topic.park.out}", containerFactory = "batchFactory")
  public void processMessageOne(List<ConsumerRecord<String, String>> list, Acknowledgment ack) {
    try {
      processRecord(list,"parkOut-one");
      ack.acknowledge();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      writeErrorInfo(list);
    }
  }

  @KafkaListener(clientIdPrefix = "parkOut-two", topics = "${kafka.consumer.topic.park.out}", containerFactory = "batchFactory")
  public void processMessageTwo(List<ConsumerRecord<String, String>> list, Acknowledgment ack) {
    try {
      processRecord(list,"parkOut-two");
      ack.acknowledge();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
    }
  }

  @KafkaListener(clientIdPrefix = "parkOut-three", topics = "${kafka.consumer.topic.park.out}", containerFactory = "batchFactory")
  public void processMessageThree(List<ConsumerRecord<String, String>> list, Acknowledgment ack) {
    try {
      processRecord(list,"parkOut-three");
      ack.acknowledge();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      writeErrorInfo(list);
    }
  }

  @KafkaListener(clientIdPrefix = "parkOut-four", topics = "${kafka.consumer.topic.park.out}", containerFactory = "batchFactory")
  public void processMessageFour(List<ConsumerRecord<String, String>> list, Acknowledgment ack) {
    try {
      processRecord(list,"parkOut-four");
      ack.acknowledge();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      writeErrorInfo(list);
    }
  }

  @KafkaListener(clientIdPrefix = "parkOut-five", topics = "${kafka.consumer.topic.park.out}", containerFactory = "batchFactory")
  public void processMessageFive(List<ConsumerRecord<String, String>> list, Acknowledgment ack) {
    try {
      processRecord(list,"parkOut-five");
      ack.acknowledge();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      writeErrorInfo(list);
    }
  }
  /**
   * 记录可能出错的处理记录
   * @param list void
   */
  private void writeErrorInfo(List<ConsumerRecord<String, String>> list) {
    for (ConsumerRecord<String, String> consumerRecord : list) {
      log.error(consumerRecord.toString());
    }
  }
  
  private void processRecord(List<ConsumerRecord<String, String>> list,String consumerNum) {
    Map<String, ParkOut> tempMap = new HashMap<>();
    // 去重相同Id后面的覆盖前面的
    list.forEach(item->{
      ParkOut out=JSONObject.parseObject(item.value(),ParkOut.class);
      log.debug("consumer {} recevied msg topic:{},partition:{},offset:{},itemId:{},outTime:{},carNo:{}controltwo:{}",consumerNum,item.topic(),item.partition(),item.offset(),out.getId(),out.getOutTime(),out.getCarNumber(),out.getControlTwo());
      tempMap.put(out.getId(), out);
    });
    list.clear();
    // 按控制单元分组
    Map<String, List<ParkOut>> controlUnitGroup = new HashMap<>();
    tempMap.forEach((k,v)->{
      List<ParkOut> valueList = controlUnitGroup.get(v.getControlTwo());
      if (valueList == null) {
        valueList = new ArrayList<>();
        controlUnitGroup.put(v.getControlTwo(), valueList);
      }
      valueList.add(v);
    });

    //将接收的数据和数据库的数据比对后拆分成更新和添加list
    List<ParkOut> addList=new ArrayList<>();
    List<ParkOut> updList=new ArrayList<>();
    controlUnitGroup.forEach((k,v)->{
      //查询数据库己经存的id
      Set<String> existIds=parkOutService.selectByIds(v, k);
      v.forEach(item->{
        if(existIds!=null && existIds.contains(item.getId())) {
          updList.add(item);
        }else {
          addList.add(item);
        }});
      
      // 根据控制单元批量入库
      long begin=System.currentTimeMillis();
      if(!addList.isEmpty()) {
        parkOutService.insertBatch(addList);
      }
      if(!updList.isEmpty()) {
        parkOutService.updateBatch(updList,k);
      }
      long end=System.currentTimeMillis();
      log.debug("{} parkOut records were successfully updated,{} were successfully added,cost {} millisecond",updList.size(),addList.size(),(end-begin));
    });
  }
}
