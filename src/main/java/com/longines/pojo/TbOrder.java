package com.longines.pojo;

public class TbOrder {
    private Integer oId;

    private Integer gId;

    private Integer gNum;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getgNum() {
        return gNum;
    }

    public void setgNum(Integer gNum) {
        this.gNum = gNum;
    }

    @Override
    public String toString() {
        return "TbOrder{" +
                "oId=" + oId +
                ", gId=" + gId +
                ", gNum=" + gNum +
                '}';
    }
}