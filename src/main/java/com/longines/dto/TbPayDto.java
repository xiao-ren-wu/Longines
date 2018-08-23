package com.longines.dto;

/**
 * @author leijing
 * @date
 */

public class TbPayDto {
    private Integer oId;
    private Integer uId;
    private Integer pId;
    private Integer payCod;
    private Integer num;
    private Integer money;

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getuId() { return uId; }

    public void setuId(Integer uId) { this.uId = uId; }

    public Integer getpayCod() { return payCod; }

    public void setpayCod(Integer payCod) { this.payCod = payCod; }

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
