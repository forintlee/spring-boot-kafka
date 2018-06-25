package com.jieshun.jsis.message.entity.park;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class DoorInOutKey {

  private Date openTime;
  @JSONField(name = "itemId")
  private String id;

  public Date getOpenTime() {
    return openTime;
  }

  public void setOpenTime(Date openTime) {
    this.openTime = openTime;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
