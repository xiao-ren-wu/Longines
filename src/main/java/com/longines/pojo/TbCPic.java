package com.longines.pojo;

import java.util.Date;

public class TbCPic {
    private Integer cId;

    private Integer cInv;

    private String cPic;

    private Date createtime;

    private Date updatetime;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcInv() {
        return cInv;
    }

    public void setcInv(Integer cInv) {
        this.cInv = cInv;
    }

    public String getcPic() {
        return cPic;
    }

    public void setcPic(String cPic) {
        this.cPic = cPic == null ? null : cPic.trim();
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