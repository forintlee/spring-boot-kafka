
 /**
 * Copyright 2018-2025 JSST All Rights Reserved.
 */
 
package com.jieshun.jsis.message.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 * @author sz_jht224
 * @since 2018年6月21日
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class GenerateMessageTest {
  @Autowired
  private KafkaTemplate<String,String> template;
  
  @Test
  public void run(){
      int i=0;
      while(true) {
        i++;
        log.info("-----------------定时发送消息"+i+"---------------");
        template.send("mb.park.in1","{\"equipName\":\"equip1001入口\",\"controlThree\":\"test1\",\"eventType\":\"BRUSHCARD\",\"isOut\":0,\"equipId\":\"equip100100000000000000000000001\",\"inTotal\":0,\"controlTwo\":\"pltest\",\"parkCode\":\"test1\",\"controlUnitId\":\"e1b72b01939f46faad0c12ac073bf708\",\"inOperator\":\"test1\",\"parkId\":\"test1001000000000000000000000001\",\"inTime\":\"2018-06-20 17:32:59\",\"subSystemId\":\"1894cd2fd71d4c46a4838ce68e7854b3\",\"equipCode\":\"equip1001\",\"itemId\":\"parkin10012525749573383000"+i+"\",\"parkName\":\"性能测试子系统1\",\"isReal\":0,\"carNumber\":\"川-TEST01\",\"inTimeInt\":\"1529487179\"}");
        template.send("mb.park.in1","{\"equipName\":\"equip1001入口\",\"controlThree\":\"test1\",\"eventType\":\"BRUSHCARD\",\"isOut\":0,\"equipId\":\"equip100100000000000000000000001\",\"inTotal\":0,\"controlTwo\":\"pltest\",\"parkCode\":\"test1\",\"controlUnitId\":\"e1b72b01939f46faad0c12ac073bf708\",\"inOperator\":\"test1\",\"parkId\":\"test1001000000000000000000000001\",\"inTime\":\"2018-06-20 17:32:59\",\"subSystemId\":\"1894cd2fd71d4c46a4838ce68e7854b3\",\"equipCode\":\"equip1001\",\"itemId\":\"parkin10013525749573383000"+i+"\",\"parkName\":\"性能测试子系统1\",\"isReal\":0,\"carNumber\":\"川-TEST01\",\"inTimeInt\":\"1529487179\"}");
        template.send("mb.park.in1","{\"equipName\":\"equip1001入口\",\"controlThree\":\"test1\",\"eventType\":\"BRUSHCARD\",\"isOut\":0,\"equipId\":\"equip100100000000000000000000001\",\"inTotal\":0,\"controlTwo\":\"pltest\",\"parkCode\":\"test1\",\"controlUnitId\":\"e1b72b01939f46faad0c12ac073bf708\",\"inOperator\":\"test1\",\"parkId\":\"test1001000000000000000000000001\",\"inTime\":\"2018-06-20 17:32:59\",\"subSystemId\":\"1894cd2fd71d4c46a4838ce68e7854b3\",\"equipCode\":\"equip1001\",\"itemId\":\"parkin10014529487379407000"+i+"\",\"parkName\":\"性能测试子系统1\",\"isReal\":0,\"carNumber\":\"川-TEST01\",\"inTimeInt\":\"1529487179\"}");
        template.send("mb.park.in1","{\"equipName\":\"equip1001入口\",\"controlThree\":\"test1\",\"eventType\":\"BRUSHCARD\",\"isOut\":0,\"equipId\":\"equip100100000000000000000000001\",\"inTotal\":0,\"controlTwo\":\"pltest\",\"parkCode\":\"test1\",\"controlUnitId\":\"e1b72b01939f46faad0c12ac073bf708\",\"inOperator\":\"test1\",\"parkId\":\"test1001000000000000000000000001\",\"inTime\":\"2018-06-20 17:32:59\",\"subSystemId\":\"1894cd2fd71d4c46a4838ce68e7854b3\",\"equipCode\":\"equip1001\",\"itemId\":\"parkin10015529487179407000"+i+"\",\"parkName\":\"性能测试子系统1\",\"isReal\":0,\"carNumber\":\"川-TEST01\",\"inTimeInt\":\"1529487179\"}");
        template.send("mb.park.out1", "{\"overTimeYHMoney\":0,\"inEquipName\":\"未知入场设备\",\"controlThree\":\"test1\",\"overTimeFlag\":0,\"genTrans\":0,\"hgMoney\":0,\"overTimeYSMoney\":0,\"cardTypeId\":\"d4697d80c44b42a8aace8654455ca2ae\",\"eventType\":\"BRUSHCARD\",\"inEquipCode\":\"\",\"equipId\":\"equip100100000000000000000000002\",\"parkingTime\":6234832,\"dkTag\":0,\"freeMoney\":0,\"inEquipId\":\"11111111111111111111111111111111\",\"outMode\":\"NORMAL\",\"outOperator\":\"test1\",\"inTotal\":0,\"controlTwo\":\"pltest\",\"parkCode\":\"test1\",\"payTypeName\":\"\",\"controlUnitId\":\"e1b72b01939f46faad0c12ac073bf708\",\"parkId\":\"test1001000000000000000000000001\",\"inTime\":\"2018-04-09 09:04:23\",\"overTimeHGMoney\":0,\"ysMoney\":10.0,\"outTime\":\"2018-06-20 12:58:15\",\"itemId\":\"parkin1001152947069510400"+i+"\",\"ssMoney\":10.0,\"outEquipCode\":\"equip1002\",\"yhMoney\":0,\"parkName\":\"性能测试子系统1\",\"carNumber\":\"川-TEST01\",\"isReal\":0,\"subsystemId\":\"1894cd2fd71d4c46a4838ce68e7854b3\",\"overTimeSSMoney\":0,\"outEquipName\":\"equip1002出口\",\"outTimeInt\":\"1529470695\"}");
        template.send("mb.park.out1", "{\"overTimeYHMoney\":0,\"inEquipName\":\"未知入场设备\",\"controlThree\":\"test1\",\"overTimeFlag\":0,\"genTrans\":0,\"hgMoney\":0,\"overTimeYSMoney\":0,\"cardTypeId\":\"d4697d80c44b42a8aace8654455ca2ae\",\"eventType\":\"BRUSHCARD\",\"inEquipCode\":\"\",\"equipId\":\"equip100100000000000000000000002\",\"parkingTime\":6234832,\"dkTag\":0,\"freeMoney\":0,\"inEquipId\":\"11111111111111111111111111111111\",\"outMode\":\"NORMAL\",\"outOperator\":\"test1\",\"inTotal\":0,\"controlTwo\":\"pltest\",\"parkCode\":\"test1\",\"payTypeName\":\"\",\"controlUnitId\":\"e1b72b01939f46faad0c12ac073bf708\",\"parkId\":\"test1001000000000000000000000001\",\"inTime\":\"2018-04-09 09:04:23\",\"overTimeHGMoney\":0,\"ysMoney\":10.0,\"outTime\":\"2018-06-20 12:58:15\",\"itemId\":\"parkin1001152947069520400"+i+"\",\"ssMoney\":10.0,\"outEquipCode\":\"equip1002\",\"yhMoney\":0,\"parkName\":\"性能测试子系统1\",\"carNumber\":\"川-TEST01\",\"isReal\":0,\"subsystemId\":\"1894cd2fd71d4c46a4838ce68e7854b3\",\"overTimeSSMoney\":0,\"outEquipName\":\"equip1002出口\",\"outTimeInt\":\"1529470695\"}");
        template.send("mb.park.out1", "{\"overTimeYHMoney\":0,\"inEquipName\":\"未知入场设备\",\"controlThree\":\"test1\",\"overTimeFlag\":0,\"genTrans\":0,\"hgMoney\":0,\"overTimeYSMoney\":0,\"cardTypeId\":\"d4697d80c44b42a8aace8654455ca2ae\",\"eventType\":\"BRUSHCARD\",\"inEquipCode\":\"\",\"equipId\":\"equip100100000000000000000000002\",\"parkingTime\":6234832,\"dkTag\":0,\"freeMoney\":0,\"inEquipId\":\"11111111111111111111111111111111\",\"outMode\":\"NORMAL\",\"outOperator\":\"test1\",\"inTotal\":0,\"controlTwo\":\"pltest\",\"parkCode\":\"test1\",\"payTypeName\":\"\",\"controlUnitId\":\"e1b72b01939f46faad0c12ac073bf708\",\"parkId\":\"test1001000000000000000000000001\",\"inTime\":\"2018-04-09 09:04:23\",\"overTimeHGMoney\":0,\"ysMoney\":10.0,\"outTime\":\"2018-06-20 12:58:15\",\"itemId\":\"parkin1001152947069530400"+i+"\",\"ssMoney\":10.0,\"outEquipCode\":\"equip1002\",\"yhMoney\":0,\"parkName\":\"性能测试子系统1\",\"carNumber\":\"川-TEST01\",\"isReal\":0,\"subsystemId\":\"1894cd2fd71d4c46a4838ce68e7854b3\",\"overTimeSSMoney\":0,\"outEquipName\":\"equip1002出口\",\"outTimeInt\":\"1529470695\"}");
        template.send("mb.park.out1", "{\"overTimeYHMoney\":0,\"inEquipName\":\"未知入场设备\",\"controlThree\":\"test1\",\"overTimeFlag\":0,\"genTrans\":0,\"hgMoney\":0,\"overTimeYSMoney\":0,\"cardTypeId\":\"d4697d80c44b42a8aace8654455ca2ae\",\"eventType\":\"BRUSHCARD\",\"inEquipCode\":\"\",\"equipId\":\"equip100100000000000000000000002\",\"parkingTime\":6234832,\"dkTag\":0,\"freeMoney\":0,\"inEquipId\":\"11111111111111111111111111111111\",\"outMode\":\"NORMAL\",\"outOperator\":\"test1\",\"inTotal\":0,\"controlTwo\":\"pltest\",\"parkCode\":\"test1\",\"payTypeName\":\"\",\"controlUnitId\":\"e1b72b01939f46faad0c12ac073bf708\",\"parkId\":\"test1001000000000000000000000001\",\"inTime\":\"2018-04-09 09:04:23\",\"overTimeHGMoney\":0,\"ysMoney\":10.0,\"outTime\":\"2018-06-20 12:58:15\",\"itemId\":\"parkin1001152947069540400"+i+"\",\"ssMoney\":10.0,\"outEquipCode\":\"equip1002\",\"yhMoney\":0,\"parkName\":\"性能测试子系统1\",\"carNumber\":\"川-TEST01\",\"isReal\":0,\"subsystemId\":\"1894cd2fd71d4c46a4838ce68e7854b3\",\"overTimeSSMoney\":0,\"outEquipName\":\"equip1002出口\",\"outTimeInt\":\"1529470695\"}");
    }
  }
}
