package com.jieshun.jsis.message.entity.park;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ParkOut extends ParkOutKey {

  private String cardId;

  private String cardType;
  @JSONField(name = "inRecordId")
  private String inId;

  private String outMode;

  private Integer parkingTime;

  private BigDecimal ysMoney;

  private BigDecimal ssMoney;

  private String outOperator;

  private String outCarPhoto;

  private String outPersonPhoto;

  private String carNumber;

  private String equipId;

  private String subsystemId;

  private Short genTrans;
  @JSONField(name = "controlUnitId")
  private String controlunitid;

  private String eventType;

  private String payTypeName;

  private BigDecimal hgMoney;

  private BigDecimal yhMoney;

  private String parkId;

  private Date createTime;

  private String userWork;

  private Date inTime;

  private String inEquipId;

  private String auditFlag;

  private String auditorId;

  private Date auditTime;

  private String auditLog;

  private String remark;

  private BigDecimal freeMoney;

  private Integer replaceFlag;

  private String appUserId;

  private Integer syncFlag;

  private Date sendTime;

  private String inEquipName;

  private String outEquipName;

  private Integer transferFlag;

  private String idno;

  private Long outTimeInt;

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

  public String getInId() {
    return inId;
  }

  public void setInId(String inId) {
    this.inId = inId;
  }

  public String getOutMode() {
    return outMode;
  }

  public void setOutMode(String outMode) {
    this.outMode = outMode;
  }

  public Integer getParkingTime() {
    return parkingTime;
  }

  public void setParkingTime(Integer parkingTime) {
    this.parkingTime = parkingTime;
  }

  public BigDecimal getYsMoney() {
    return ysMoney;
  }

  public void setYsMoney(BigDecimal ysMoney) {
    this.ysMoney = ysMoney;
  }

  public BigDecimal getSsMoney() {
    return ssMoney;
  }

  public void setSsMoney(BigDecimal ssMoney) {
    this.ssMoney = ssMoney;
  }

  public String getOutOperator() {
    return outOperator;
  }

  public void setOutOperator(String outOperator) {
    this.outOperator = outOperator;
  }

  public String getOutCarPhoto() {
    return outCarPhoto;
  }

  public void setOutCarPhoto(String outCarPhoto) {
    this.outCarPhoto = outCarPhoto;
  }

  public String getOutPersonPhoto() {
    return outPersonPhoto;
  }

  public void setOutPersonPhoto(String outPersonPhoto) {
    this.outPersonPhoto = outPersonPhoto;
  }

  public String getCarNumber() {
    return carNumber;
  }

  public void setCarNumber(String carNumber) {
    this.carNumber = carNumber;
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

  public Short getGenTrans() {
    return genTrans;
  }

  public void setGenTrans(Short genTrans) {
    this.genTrans = genTrans;
  }

  public String getControlunitid() {
    return controlunitid;
  }

  public void setControlunitid(String controlunitid) {
    this.controlunitid = controlunitid;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public String getPayTypeName() {
    return payTypeName;
  }

  public void setPayTypeName(String payTypeName) {
    this.payTypeName = payTypeName;
  }

  public BigDecimal getHgMoney() {
    return hgMoney;
  }

  public void setHgMoney(BigDecimal hgMoney) {
    this.hgMoney = hgMoney;
  }

  public BigDecimal getYhMoney() {
    return yhMoney;
  }

  public void setYhMoney(BigDecimal yhMoney) {
    this.yhMoney = yhMoney;
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

  public String getUserWork() {
    return userWork;
  }

  public void setUserWork(String userWork) {
    this.userWork = userWork;
  }

  public Date getInTime() {
    return inTime;
  }

  public void setInTime(Date inTime) {
    this.inTime = inTime;
  }

  public String getInEquipId() {
    return inEquipId;
  }

  public void setInEquipId(String inEquipId) {
    this.inEquipId = inEquipId;
  }

  public String getAuditFlag() {
    return auditFlag;
  }

  public void setAuditFlag(String auditFlag) {
    this.auditFlag = auditFlag;
  }

  public String getAuditorId() {
    return auditorId;
  }

  public void setAuditorId(String auditorId) {
    this.auditorId = auditorId;
  }

  public Date getAuditTime() {
    return auditTime;
  }

  public void setAuditTime(Date auditTime) {
    this.auditTime = auditTime;
  }

  public String getAuditLog() {
    return auditLog;
  }

  public void setAuditLog(String auditLog) {
    this.auditLog = auditLog;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public BigDecimal getFreeMoney() {
    return freeMoney;
  }

  public void setFreeMoney(BigDecimal freeMoney) {
    this.freeMoney = freeMoney;
  }

  public Integer getReplaceFlag() {
    return replaceFlag;
  }

  public void setReplaceFlag(Integer replaceFlag) {
    this.replaceFlag = replaceFlag;
  }

  public String getAppUserId() {
    return appUserId;
  }

  public void setAppUserId(String appUserId) {
    this.appUserId = appUserId;
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

  public String getInEquipName() {
    return inEquipName;
  }

  public void setInEquipName(String inEquipName) {
    this.inEquipName = inEquipName;
  }

  public String getOutEquipName() {
    return outEquipName;
  }

  public void setOutEquipName(String outEquipName) {
    this.outEquipName = outEquipName;
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

  public Long getOutTimeInt() {
    return outTimeInt;
  }

  public void setOutTimeInt(Long outTimeInt) {
    this.outTimeInt = outTimeInt;
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
