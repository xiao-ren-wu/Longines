package com.longines.pojo;

public class TbShoppingCartKey {
    /**
     * 用户ID
     */
    protected Integer uId;
    /**
     * 商品ID
     */
    protected Integer gId;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }
}