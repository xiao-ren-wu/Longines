package com.longines.pojo;

public class TbCoupons extends TbCouponsKey {
    private String uId;

    private String discount;

    private Integer number;

    private String tLimit;

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
}