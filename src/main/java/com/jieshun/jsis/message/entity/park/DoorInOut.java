package com.jieshun.jsis.message.entity.park;

import com.alibaba.fastjson.annotation.JSONField;

public class DoorInOut extends DoorInOutKey {

  private String cardId;

  @JSONField(name = "cardTypeId")
  private String cardType;
  @JSONField(name = "openType")
  private String openMode;

  private String openOperator;

  private String equipId;

  private String subsystemId;

  private String inoutPhoto;

  private String controlunitid;

  private Long inoutTimeInt;

  private String controlTwo;

  private String controlThree;

  private String controlFour;

  private String controlFive;

  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public String getOpenMode() {
    return openMode;
  }

  public void setOpenMode(String openMode) {
    this.openMode = openMode;
  }

  public String getOpenOperator() {
    return openOperator;
  }

  public void setOpenOperator(String openOperator) {
    this.openOperator = openOperator;
  }

  public String getEquipId() {
    return equipId;
  }

  public void setEquipId(String equipId) {
    this.equipId = equipId;
  }

  public String getSubsystemId() {
    return subsystemId;
  }

  public void setSubsystemId(String subsystemId) {
    this.subsystemId = subsystemId;
  }

  public String getInoutPhoto() {
    return inoutPhoto;
  }

  public void setInoutPhoto(String inoutPhoto) {
    this.inoutPhoto = inoutPhoto;
  }

  public String getControlunitid() {
    return controlunitid;
  }

  public void setControlunitid(String controlunitid) {
    this.controlunitid = controlunitid;
  }

  public Long getInoutTimeInt() {
    return inoutTimeInt;
  }

  public void setInoutTimeInt(Long inoutTimeInt) {
    this.inoutTimeInt = inoutTimeInt;
  }

  public String getControlTwo() {
    return controlTwo;
  }

  public void setControlTwo(String controlTwo) {
    this.controlTwo = controlTwo;
  }

  public String getControlThree() {
    return controlThree;
  }

  public void setControlThree(String controlThree) {
    this.controlThree = controlThree;
  }

  public String getControlFour() {
    return controlFour;
  }

  public void setControlFour(String controlFour) {
    this.controlFour = controlFour;
  }

  public String getControlFive() {
    return controlFive;
  }

  public void setControlFive(String controlFive) {
    this.controlFive = controlFive;
  }

}
