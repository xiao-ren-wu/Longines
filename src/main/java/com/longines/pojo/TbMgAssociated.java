package com.longines.pojo;

import java.util.Date;

public class TbMgAssociated extends TbMgAssociatedKey {
    private Integer inv;

    private Date sTime;

    public Integer getInv() {
        return inv;
    }

    public void setInv(Integer inv) {
        this.inv = inv;
    }

    public Date getsTime() {
        return sTime;
    }

    public void setsTime(Date sTime) {
        this.sTime = sTime;
    }

    @Override
    public String toString() {
        return "TbMgAssociated{" +
                "inv=" + inv +
                ", sTime=" + sTime +
                ", mId=" + mId +
                ", gId=" + gId +
                '}';
    }
}