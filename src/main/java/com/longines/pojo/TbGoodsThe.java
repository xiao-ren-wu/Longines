package com.longines.pojo;

import java.util.Date;

/**
 * @author weiyi
 * @since 2018-08-08 21:45
 * @version 1.0
 */
public class TbGoodsThe {
    private Integer theId;

    private String thePic;

    private String theDes;

    private Date createtime;

    private Date updatetime;

    public Integer getTheId() {
        return theId;
    }

    public void setTheId(Integer theId) {
        this.theId = theId;
    }

    public String getThePic() {
        return thePic;
    }

    public void setThePic(String thePic) {
        this.thePic = thePic == null ? null : thePic.trim();
    }

    public String getTheDes() {
        return theDes;
    }

    public void setTheDes(String theDes) {
        this.theDes = theDes == null ? null : theDes.trim();
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