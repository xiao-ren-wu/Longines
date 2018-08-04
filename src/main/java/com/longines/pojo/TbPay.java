package com.longines.pojo;

import java.util.Date;

public class TbPay {
    private Integer pId;

    private Integer uId;

    private Integer oId;

    private String pMethod;

    private String tNum;

    private Date pmData;

    private Date createtime;

    private Date updatetime;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getpMethod() {
        return pMethod;
    }

    public void setpMethod(String pMethod) {
        this.pMethod = pMethod == null ? null : pMethod.trim();
    }

    public String gettNum() {
        return tNum;
    }

    public void settNum(String tNum) {
        this.tNum = tNum == null ? null : tNum.trim();
    }

    public Date getPmData() {
        return pmData;
    }

    public void setPmData(Date pmData) {
        this.pmData = pmData;
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