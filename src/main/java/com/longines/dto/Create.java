package com.longines.dto;

import java.util.Date;
import java.util.List;

public class Create {
    private List<HAHA> haha;
    private Date creDate;
    private Long aAmount;
    private Long freight;
    private Integer oId;
    private String dMethod;

    public List<HAHA> getHaha() {
        return haha;
    }

    public void setHaha(List<HAHA> haha) {
        this.haha = haha;
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
