package com.longines.pojo;

import java.util.Date;

public class TbOrderInfo {
    private Integer oId;

    private Integer uId;

    private Integer aId;

    private Date creDate;

    private Date delDate;

    private Date tbDate;

    private Long aAmount;

    private Long freight;

    private Integer sNum;

    private String dMethod;

    private Date createtime;

    private Date updatetime;

    @Override
    public String toString() {
        return "TbOrderInfo{" +
                "oId=" + oId +
                ", uId=" + uId +
                ", aId=" + aId +
                ", creDate=" + creDate +
                ", delDate=" + delDate +
                ", tbDate=" + tbDate +
                ", aAmount=" + aAmount +
                ", freight=" + freight +
                ", sNum=" + sNum +
                ", dMethod='" + dMethod + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Date getCreDate() {
        return creDate;
    }

    public void setCreDate(Date creDate) {
        this.creDate = creDate;
    }

    public Date getDelDate() {
        return delDate;
    }

    public void setDelDate(Date delDate) {
        this.delDate = delDate;
    }

    public Date getTbDate() {
        return tbDate;
    }

    public void setTbDate(Date tbDate) {
        this.tbDate = tbDate;
    }

    public Long getaAmount() {
        return aAmount;
    }

    public void setaAmount(Long aAmount) {
        this.aAmount = aAmount;
    }

    public Long getFreight() {
        return freight;
    }

    public void setFreight(Long freight) {
        this.freight = freight;
    }

    public Integer getsNum() {
        return sNum;
    }

    public void setsNum(Integer sNum) {
        this.sNum = sNum;
    }

    public String getdMethod() {
        return dMethod;
    }

    public void setdMethod(String dMethod) {
        this.dMethod = dMethod == null ? null : dMethod.trim();
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