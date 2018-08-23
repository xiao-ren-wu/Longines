package com.longines.vo;

import java.util.Date;

/**
 * @author FengTianHao
 * @version 1.0
 * @since 2018/8/13 20:29
 */
public class TbGoodsInfoExt {
    private Integer gId;

    private String gname;

    private String brand;

    private Long price;

    private Integer theId;

    private String mov;

    private String func;

    private String aPeo;

    private String dial;

    private String strap;

    private String wBut;

    private String gPic;

    private String gPic2;

    private String gPic3;

    private String sName;

    private String mPic;

    private Integer mId;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmPic() {
        return mPic;
    }

    public void setmPic(String mPic) {
        this.mPic = mPic;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    private Date sTime;

    public Date getsTime() {
        return sTime;
    }

    public void setsTime(Date sTime) {
        this.sTime = sTime;
    }



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

    public Integer getTheId() {
        return theId;
    }

    public void setTheId(Integer theId) {
        this.theId = theId;
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

        public String getgPic3() {

        return gPic3;
    }

    public void setgPic3(String gPic3) {
        this.gPic3 = gPic3;
    }

    public String getgPic2() {

        return gPic2;
    }

    public void setgPic2(String gPic2) {
        this.gPic2 = gPic2;
    }

    @Override
    public String toString() {
        return "TbGoodsInfoExt{" + "gId=" + gId + ", gname='" + gname + '\'' + ", brand='" + brand + '\'' + ", price=" + price + ", theId=" + theId + ", mov='" + mov + '\'' + ", func='" + func + '\'' + ", aPeo='" + aPeo + '\'' + ", dial='" + dial + '\'' + ", strap='" + strap + '\'' + ", wBut='" + wBut + '\'' + ", gPic='" + gPic + '\'' + ", gPic2='" + gPic2 + '\'' + ", gPic3='" + gPic3 + '\'' + ", sName='" + sName + '\'' + ", mPic='" + mPic + '\'' + ", mId=" + mId + ", sTime=" + sTime + '}';
    }
}
