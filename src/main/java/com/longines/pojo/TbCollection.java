package com.longines.pojo;

import java.util.Date;

public class TbCollection extends TbCollectionKey {
    private Date collTime;

    private Long cPrice;

    private Integer pur;

    private Integer invalid;

    public Date getCollTime() {
        return collTime;
    }

    public void setCollTime(Date collTime) {
        this.collTime = collTime;
    }

    public Long getcPrice() {
        return cPrice;
    }

    public void setcPrice(Long cPrice) {
        this.cPrice = cPrice;
    }

    public Integer getPur() {
        return pur;
    }

    public void setPur(Integer pur) {
        this.pur = pur;
    }

    public Integer getInvalid() {
        return invalid;
    }

    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }
}