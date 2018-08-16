package com.longines.dto;

/**
 * @author leijing
 * @date
 */

public class TbPayDto {
    private Integer oId;
    private Integer uId;
    private Integer pId;
    private String  payCod;

    public Integer getuId() { return uId; }

    public void setuId(Integer uId) { this.uId = uId; }

    public String getpayCod() { return payCod; }

    public void setpayCod(String payCod) { this.payCod = payCod; }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }


}
