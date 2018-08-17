package com.longines.pojo;

import java.util.Date;

/**
 * @author    liuchanghui
 *
 * @since     2018/8/8/008 22:47
 * @version   1.0
 */
public class TbCollection extends TbCollectionKey {
    private Date collTime;

    private Long cPrice;

    private Integer pur;

    private Integer invalid;

    private Date createtime;

    private Date updatetime;

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

    @Override
    public String toString() {
        return "TbCollectionService{" +
                ", uId=" + uId +
                ", gId=" + gId +
                ", collTime=" + collTime +
                ", cPrice=" + cPrice +
                ", pur=" + pur +
                ", invalid=" + invalid +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}'+"\n"
               ;
    }
}