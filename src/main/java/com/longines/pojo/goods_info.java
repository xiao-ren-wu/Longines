package com.longines.pojo;


public class goods_info {
    /**
     *  商品ID
     */
    private int g_id;
    private String gname;
    private String brand;
    private double price;
    private String theme;
    private String mov;
    private String func;
    private String a_peo;
    private String dial;
    private String strap;
    private String w_but;
    private String g_pic;

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setMov(String mov) {
        this.mov = mov;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public void setA_peo(String a_peo) {
        this.a_peo = a_peo;
    }

    public void setDial(String dial) {
        this.dial = dial;
    }

    public void setStrap(String strap) {
        this.strap = strap;
    }

    public void setW_but(String w_but) {
        this.w_but = w_but;
    }

    public void setG_pic(String g_pic) {
        this.g_pic = g_pic;
    }

    public int getG_id() {
        return g_id;
    }

    public String getGname() {
        return gname;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getTheme() {
        return theme;
    }

    public String getMov() {
        return mov;
    }

    public String getFunc() {
        return func;
    }

    public String getA_peo() {
        return a_peo;
    }

    public String getDial() {
        return dial;
    }

    public String getStrap() {
        return strap;
    }

    public String getW_but() {
        return w_but;
    }

    public String getG_pic() {
        return g_pic;
    }

    @Override
    public String toString() {
        return "goods_info{" +
                "g_id=" + g_id +
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

