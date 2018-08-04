package com.longines.pojo;

public class TbShoppingCart extends TbShoppingCartKey {
    private Integer gNum;

    private Long tAmount;

    private Integer status;

    public Integer getgNum() {
        return gNum;
    }

    public void setgNum(Integer gNum) {
        this.gNum = gNum;
    }

    public Long gettAmount() {
        return tAmount;
    }

    public void settAmount(Long tAmount) {
        this.tAmount = tAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}