package com.longines.pojo;


public class goods_info {
    /**
     *  商品ID
     */
    private int g_id;
<<<<<<< HEAD
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
=======
    private String gname;      //商品名
    private String brand;      //品牌
    private double price;      //价格
    private String theme;      //主题
    private String mov;        //机芯
    private String func;       //功能
    private String a_peo;      //适用人群
    private String dial;       //表盘
    private String strap;      //表带
    private String w_but;      //表扣
    private String g_pic;      //商品图片
    public int getGoods_id() {
        return g_id;
    }
    public void setGoods_id(int goods_id) {
        this.g_id = goods_id;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
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
        return "goods_info [goods_id=" + g_id + ", gname=" + gname + ", brand=" + brand + ", price=" + price
                + ", theme=" + theme + ", mov=" + mov + ", func=" + func + ", a_peo=" + a_peo + ", dial=" + dial
                + ", strap=" + strap + ", w_but=" + w_but + ", g_pic=" + g_pic + "]";
    }


>>>>>>> 0fd1e24d83ff183679af25f965a3a6455e88cddf
}

