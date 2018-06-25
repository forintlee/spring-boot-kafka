package com.jieshun.jsis.message.entity.park;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ParkOutKey {

    private Date outTime;
    @JSONField(name="itemId")
    private String id;

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}