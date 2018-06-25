
/**
 * Copyright 2018-2025 JSST All Rights Reserved.
 */

package com.jieshun.jsis.message.enums;


/**
 * 出场类型枚举
 * 
 * @author sz_jht224
 * @since 2018年6月7日
 */

public enum ParkOutModeEnum {
  FIXCAR, // 出场模式为固定车
  SHAREFREE, // 车位分享免费
  FREETIME, // 免费时间内
  SHAREOVERCHARGE, // 车位分享超时收费
  MANPUT, // 人工放行
  OTHER, // 其它
  HANDWORK, // 手动开闸
  FREE, // 免费
  CARNOWHITE, // 车牌白名单免费
  NORMAL, // 正常收费
  DISCNTFREE, // 打折后免费
  HIGHFEE, // 最高收费已满
  UNTEPFREE;// 非临时车免费

  public static ParkOutModeEnum getOutModeEnum(String str) {
    for (ParkOutModeEnum value : ParkOutModeEnum.values()) {
      if (value.toString().equals(str)) {
        return value;
      }
    }
    return null;
  }
}
