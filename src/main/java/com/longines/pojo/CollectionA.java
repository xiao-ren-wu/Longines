package com.longines.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class CollectionA {

    private Integer user_id;
    private Integer goods_id;
    private Date coll_time;
    private BigDecimal c_price;
    private Integer pur;
    private Integer invalid;

    @Override
    public String toString() {
        return "Collection{" +
                "user_id=" + user_id +
                ", goods_id=" + goods_id +
                ", coll_time=" + coll_time +
                ", c_price=" + c_price +
                ", pur=" + pur +
                ", invalid=" + invalid +
                '}';
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Date getColl_time() {
        return coll_time;
    }

    public void setColl_time(Date coll_time) {
        this.coll_time = coll_time;
    }

    public BigDecimal getC_price() {
        return c_price;
    }

    public void setC_price(BigDecimal c_price) {
        this.c_price = c_price;
    }

    public Integer getPur() {
        return pur;
    }

    public void setPur(Integer pur) {
        this.pur = pur;
    }

    public Integer getInvalid() {
        return invalid;
    }

    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }
}
