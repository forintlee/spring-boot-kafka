package com.jieshun.jsis.message.entity.park;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ParkInKey {

    private Date inTime;
    @JSONField(name="itemId")
    private String id;

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}