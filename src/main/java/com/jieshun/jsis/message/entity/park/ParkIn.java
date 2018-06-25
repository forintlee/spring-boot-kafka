package com.jieshun.jsis.message.entity.park;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ParkIn extends ParkInKey {

  private String cardId;
  @JSONField(name="cardTypeId")
  private String cardType;

  private String inOperator;

  private String inCarPhoto;

  private String inPersonPhoto;

  private String carNumber;

  private Short isOut;

  private String equipId;

  private String subsystemId;

  private String controlunitid;

  private Date chargeTime;

  private BigDecimal chargeMoney;

  private String eventType;

  private String parkId;

  private Date createTime;
  @JSONField(name="equipName")
  private String inEquipName;

  private Integer transferFlag;

  private String idno;

  private Integer syncFlag;

  private Date sendTime;

  private Long inTimeInt;

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

  public String getInOperator() {
    return inOperator;
  }

  public void setInOperator(String inOperator) {
    this.inOperator = inOperator;
  }

  public String getInCarPhoto() {
    return inCarPhoto;
  }

  public void setInCarPhoto(String inCarPhoto) {
    this.inCarPhoto = inCarPhoto;
  }

  public String getInPersonPhoto() {
    return inPersonPhoto;
  }

  public void setInPersonPhoto(String inPersonPhoto) {
    this.inPersonPhoto = inPersonPhoto;
  }

  public String getCarNumber() {
    return carNumber;
  }

  public void setCarNumber(String carNumber) {
    this.carNumber = carNumber;
  }

  public Short getIsOut() {
    return isOut;
  }

  public void setIsOut(Short isOut) {
    this.isOut = isOut;
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

  public String getControlunitid() {
    return controlunitid;
  }

  public void setControlunitid(String controlunitid) {
    this.controlunitid = controlunitid;
  }

  public Date getChargeTime() {
    return chargeTime;
  }

  public void setChargeTime(Date chargeTime) {
    this.chargeTime = chargeTime;
  }

  public BigDecimal getChargeMoney() {
    return chargeMoney;
  }

  public void setChargeMoney(BigDecimal chargeMoney) {
    this.chargeMoney = chargeMoney;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public String getParkId() {
    return parkId;
  }

  public void setParkId(String parkId) {
    this.parkId = parkId;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getInEquipName() {
    return inEquipName;
  }

  public void setInEquipName(String inEquipName) {
    this.inEquipName = inEquipName;
  }

  public Integer getTransferFlag() {
    return transferFlag;
  }

  public void setTransferFlag(Integer transferFlag) {
    this.transferFlag = transferFlag;
  }

  public String getIdno() {
    return idno;
  }

  public void setIdno(String idno) {
    this.idno = idno;
  }

  public Integer getSyncFlag() {
    return syncFlag;
  }

  public void setSyncFlag(Integer syncFlag) {
    this.syncFlag = syncFlag;
  }

  public Date getSendTime() {
    return sendTime;
  }

  public void setSendTime(Date sendTime) {
    this.sendTime = sendTime;
  }

  public Long getInTimeInt() {
    return inTimeInt;
  }

  public void setInTimeInt(Long inTimeInt) {
    this.inTimeInt = inTimeInt;
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
