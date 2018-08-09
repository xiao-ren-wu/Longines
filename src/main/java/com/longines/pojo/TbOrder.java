package com.longines.pojo;

import java.util.Date;

public class TbOrder extends TbOrderKey {

    private Integer gNum;

    private Date createtime;

    private Date updatetime;

    public Integer getgNum() {
        return gNum;
    }

    public void setgNum(Integer gNum) {
        this.gNum = gNum;
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
        return "TbOrder{" +
                "gNum=" + gNum +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }
}
