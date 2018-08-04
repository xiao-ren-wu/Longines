package com.longines.pojo;

import java.util.Date;

public class TbCoupons extends TbCouponsKey {
    private String uId;

    private String discount;

    private Integer number;

    private String tLimit;

    private Date createtime;

    private Date updatetime;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String gettLimit() {
        return tLimit;
    }

    public void settLimit(String tLimit) {
        this.tLimit = tLimit == null ? null : tLimit.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}