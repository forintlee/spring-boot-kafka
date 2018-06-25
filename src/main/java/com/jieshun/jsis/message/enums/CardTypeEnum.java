
/**
 * Copyright 2018-2025 JSST All Rights Reserved.
 */

package com.jieshun.jsis.message.enums;

/**
 * 卡类型枚举
 * 
 * @author sz_jht224
 * @since 2018年5月30日
 */

public enum CardTypeEnum {
  TEMPCARD("TEMPCARD", "临时卡"),
  STORECARD("STORECARD", "储值卡"),
  USER("USER", "用户卡"),
  MONTHCARD("MONTHCARD", "月卡"),
  SPECIACARD("SPECIACARD","特殊卡"),
  MANAGER("MANAGER", "管控卡"),
  FREECARD("FREECARD", "免费卡");

  private CardTypeEnum(String code, String name) {
    this.code = code;
    this.name = name;
  }

  private String code;
  private String name;

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public static CardTypeEnum getCardTypeEnumByName(String name) {
    CardTypeEnum[] enums = CardTypeEnum.values();
    CardTypeEnum obj = null;
    for (CardTypeEnum cardTypeEnum : enums) {
      if (cardTypeEnum.name.equals(name)) {
        obj = cardTypeEnum;
        break;
      }
    }
    return obj;
  }

  public static CardTypeEnum getEnumByCardType(String cardType) {
    CardTypeEnum[] enums = CardTypeEnum.values();
    CardTypeEnum obj = null;
    for (CardTypeEnum cardTypeEnum : enums) {
      if (cardTypeEnum.code.equals(cardType)) {
        obj = cardTypeEnum;
        break;
      }
    }
    return obj;
  }
}
