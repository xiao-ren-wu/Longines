package com.longines.pojo;

import java.math.BigDecimal;

public class Goods {
    private Integer goods_id;
    private String  gname;
    private String brand;
    private BigDecimal price;
    private String theme;
    private String  mov;
    private String func;
    private String a_peo;
    private String dial;
    private String strap;
    private String w_but;
    private String g_pic;

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getMov() {
        return mov;
    }

    public void setMov(String mov) {
        this.mov = mov;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getA_peo() {
        return a_peo;
    }

    public void setA_peo(String a_peo) {
        this.a_peo = a_peo;
    }

    public String getDial() {
        return dial;
    }

    public void setDial(String dial) {
        this.dial = dial;
    }

    public String getStrap() {
        return strap;
    }

    public void setStrap(String strap) {
        this.strap = strap;
    }

    public String getW_but() {
        return w_but;
    }

    public void setW_but(String w_but) {
        this.w_but = w_but;
    }

    public String getG_pic() {
        return g_pic;
    }

    public void setG_pic(String g_pic) {
        this.g_pic = g_pic;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", gname='" + gname + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", theme='" + theme + '\'' +
                ", mov='" + mov + '\'' +
                ", func='" + func + '\'' +
                ", a_peo='" + a_peo + '\'' +
                ", dial='" + dial + '\'' +
                ", strap='" + strap + '\'' +
                ", w_but='" + w_but + '\'' +
                ", g_pic='" + g_pic + '\'' +
                '}';
    }
}
