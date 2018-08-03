package com.longines.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuchanghui
 * @since  2018/8/1 16:06
 */
public class CollectionA {

    private Integer userid;
    private Integer goodsid;
    private Date colltime;
    private BigDecimal price;
    private Integer pur;
    private Integer invalid;

    public Integer getUserid() {
        return userid;
    }

    @Override
    public String toString() {
        return "CollectionA{" +
                "userid=" + userid +
                ", goodsid=" + goodsid +
                ", colltime=" + colltime +
                ", price=" + price +
                ", pur=" + pur +
                ", invalid=" + invalid +
                '}';
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Date getColltime() {
        return colltime;
    }

    public void setColltime(Date colltime) {
        this.colltime = colltime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
