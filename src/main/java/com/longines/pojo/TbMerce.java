package com.longines.pojo;

import java.util.Date;

public class TbMerce {
    private Integer mId;

    private String sname;

    private String sCred;

    private String sTime;

    private String home;

    private String cIntro;

    private String mTel;

    private String sManager;

    private String bCard;

    private String pSer;

    private Date createtime;

    private Date updatetime;

    public String mPic;

    public String getmPic() {
        return mPic;
    }

    public void setmPic(String mPic) {
        this.mPic = mPic;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getsCred() {
        return sCred;
    }

    public void setsCred(String sCred) {
        this.sCred = sCred == null ? null : sCred.trim();
    }

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime == null ? null : sTime.trim();
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home == null ? null : home.trim();
    }

    public String getcIntro() {
        return cIntro;
    }

    public void setcIntro(String cIntro) {
        this.cIntro = cIntro == null ? null : cIntro.trim();
    }

    public String getmTel() {
        return mTel;
    }

    public void setmTel(String mTel) {
        this.mTel = mTel == null ? null : mTel.trim();
    }

    public String getsManager() {
        return sManager;
    }

    public void setsManager(String sManager) {
        this.sManager = sManager == null ? null : sManager.trim();
    }

    public String getbCard() {
        return bCard;
    }

    public void setbCard(String bCard) {
        this.bCard = bCard == null ? null : bCard.trim();
    }

    public String getpSer() {
        return pSer;
    }

    public void setpSer(String pSer) {
        this.pSer = pSer == null ? null : pSer.trim();
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