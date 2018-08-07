package com.longines.pojo;

import java.util.Date;

public class TbGoodsInfo {
    private Integer gId;

    private String gname;

    private String brand;

    private Long price;

    private String theId;

    private String mov;

    private String func;

    private String aPeo;

    private String dial;

    private String strap;

    private String wBut;

    private String gPic;

    private Date createtime;

    private Date updatetime;

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

    public String getTheId() {
        return theId;
    }

    public void setTheId(String theId) {
        this.theId = theId == null ? null : theId.trim();
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