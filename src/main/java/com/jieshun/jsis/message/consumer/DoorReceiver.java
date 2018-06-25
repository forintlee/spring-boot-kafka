
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
import com.jieshun.jsis.message.entity.park.DoorInOut;
import com.jieshun.jsis.message.service.IDoorService;

import lombok.extern.slf4j.Slf4j;

/**
 * 门禁数据接收组件
 * 由于kafka分了五个区,所有下面有启用五个消费者同时消费
 * 为确保数据不丢失,数据持久化后,采手动提交
 * @author sz_jht224
 * @since 2018年6月19日
 */
@Component
@Slf4j
public class DoorReceiver {

  @Autowired
  private IDoorService doorService;
  
  @KafkaListener(clientIdPrefix = "door-one", topics = "${kafka.consumer.topic.door}", containerFactory = "batchFactory")
  public void processMessageOne(List<ConsumerRecord<String, String>> list, Acknowledgment ack) {
    try {
      processRecord(list,"door-one");
      ack.acknowledge();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      writeErrorInfo(list);
    }
  }

  @KafkaListener(clientIdPrefix = "door-two", topics = "${kafka.consumer.topic.door}", containerFactory = "batchFactory")
  public void processMessageTwo(List<ConsumerRecord<String, String>> list, Acknowledgment ack) {
    try {
      processRecord(list,"door-two");
      ack.acknowledge();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      writeErrorInfo(list);
    }
  }

  @KafkaListener(clientIdPrefix = "door-three", topics = "${kafka.consumer.topic.door}", containerFactory = "batchFactory")
  public void processMessageThree(List<ConsumerRecord<String, String>> list, Acknowledgment ack) {
    try {
      processRecord(list,"door-three");
      ack.acknowledge();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      writeErrorInfo(list);
    }
  }

  @KafkaListener(clientIdPrefix = "door-four", topics = "${kafka.consumer.topic.door}", containerFactory = "batchFactory")
  public void processMessageFour(List<ConsumerRecord<String, String>> list, Acknowledgment ack) {
    try {
      processRecord(list,"door-four");
      ack.acknowledge();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      writeErrorInfo(list);
    }
  }

  @KafkaListener(clientIdPrefix = "door-five", topics = "${kafka.consumer.topic.door}", containerFactory = "batchFactory")
  public void processMessageFive(List<ConsumerRecord<String, String>> list, Acknowledgment ack) {
    try {
      processRecord(list,"door-five");
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
    Map<String, DoorInOut> tempMap = new HashMap<>();
    // 去重相同Id后面的覆盖前面的
    list.forEach(item->{
      DoorInOut door=JSONObject.parseObject(item.value(),DoorInOut.class);
      //log.debug("consumer {} recevied msg topic:{},partition:{},offset:{},itemId:{},controltwo:{}",consumerNum,item.topic(),item.partition(),item.offset(),door.getId(),door.getControlTwo());
      if(!tempMap.containsKey(door.getId())) {
        tempMap.put(door.getId(), door);
      }
    });
    list.clear();
    // 按控制单元分组
    Map<String, List<DoorInOut>> controlUnitGroup = new HashMap<>();
    tempMap.forEach((k,v)->{
      List<DoorInOut> valueList = controlUnitGroup.get(v.getControlTwo());
      if (valueList == null) {
        valueList = new ArrayList<>();
        controlUnitGroup.put(v.getControlTwo(), valueList);
      }
      valueList.add(v);
    });

    //将接收的数据和数据库的数据比对后拆分成更新和添加list
    List<DoorInOut> addList=new ArrayList<>();
    controlUnitGroup.forEach((k,v)->{
      //查询数据库己经存的id
      Set<String> existIds=doorService.selectByIds(v, k);
      v.forEach(item->{
        if(existIds!=null && existIds.contains(item.getId())) {
          return;
        }
        addList.add(item);
      });
      
      // 根据控制单元批量入库
      long begin=System.currentTimeMillis();
      if(!addList.isEmpty()) {
        doorService.insertBatch(addList);
      }
      long end=System.currentTimeMillis();
      log.debug("{} door records were successfully added,cost {} millisecond",addList.size(),(end-begin));
    });
  }
}
