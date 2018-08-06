package com.longines.pojo;

public class TbGoodsInfo {
    private Integer gId;

    private String gname;

    private String brand;

    private Long price;

    private String theme;

    private String mov;

    private String func;

    private String aPeo;

    private String dial;

    private String strap;

    private String wBut;

    private String gPic;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getMov() {
        return mov;
    }

    public void setMov(String mov) {
        this.mov = mov == null ? null : mov.trim();
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func == null ? null : func.trim();
    }

    public String getaPeo() {
        return aPeo;
    }

    public void setaPeo(String aPeo) {
        this.aPeo = aPeo == null ? null : aPeo.trim();
    }

    public String getDial() {
        return dial;
    }

    public void setDial(String dial) {
        this.dial = dial == null ? null : dial.trim();
    }

    public String getStrap() {
        return strap;
    }

    public void setStrap(String strap) {
        this.strap = strap == null ? null : strap.trim();
    }

    public String getwBut() {
        return wBut;
    }

    public void setwBut(String wBut) {
        this.wBut = wBut == null ? null : wBut.trim();
    }

    public String getgPic() {
        return gPic;
    }

    public void setgPic(String gPic) {
        this.gPic = gPic == null ? null : gPic.trim();
    }
}