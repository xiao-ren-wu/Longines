package com.longines.dto;

import java.util.Date;
import java.util.List;

public class Create {
    private String consignee;
    private String sAdd;
    private String cTel;
    private List<String> sname;
    private List<String> mPic;
    private List<String> gname;
    private List<Long> price;
    private List<String> gPic;
    private Date creDate;
    private Long aAmount;
    private Long freight;
    private Integer oId;
    private String dMethod;

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getsAdd() {
        return sAdd;
    }

    public void setsAdd(String sAdd) {
        this.sAdd = sAdd;
    }

    public String getcTel() {
        return cTel;
    }

    public void setcTel(String cTel) {
        this.cTel = cTel;
    }

    public List<String> getSname() {
        return sname;
    }

    public void setSname(List<String> sname) {
        this.sname = sname;
    }

    public List<String> getmPic() {
        return mPic;
    }

    public void setmPic(List<String> mPic) {
        this.mPic = mPic;
    }

    public List<String> getGname() {
        return gname;
    }

    public void setGname(List<String> gname) {
        this.gname = gname;
    }

    public List<Long> getPrice() {
        return price;
    }

    public void setPrice(List<Long> price) {
        this.price = price;
    }

    public List<String> getgPic() {
        return gPic;
    }

    public void setgPic(List<String> gPic) {
        this.gPic = gPic;
    }

    public Date getCreDate() {
        return creDate;
    }

    public void setCreDate(Date creDate) {
        this.creDate = creDate;
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

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getdMethod() {
        return dMethod;
    }

    public void setdMethod(String dMethod) {
        this.dMethod = dMethod;
    }
}
