package com.yubaokang.web.app.demo.entity;

import java.util.Date;

/**
 * Created by yubao on 2017/3/5.
 */
public class SuccessKilled {
    private long seckillId;
    private String userPhone;
    private short state;
    private Date createTime;

    //多对一
    private Seckill seckill;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPhone='" + userPhone + '\'' +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
