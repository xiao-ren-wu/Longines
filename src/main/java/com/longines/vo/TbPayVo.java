package com.longines.vo;

/**
 * @author leijing
 * @date
 */

public class TbPayVo {
    private Integer uId;
    private String Pic;
    private Long aAmount;
    private Integer pId;
    private int state;



    public Long getaAmount() {
        return aAmount;
    }

    public void setaAmount(Long aAmount) {
        this.aAmount = aAmount;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getPic() {
        return Pic;
    }

    public void setPic(String pic) {
        Pic = pic;
    }

    public int getstate() {
        return state;
    }

    public void setstate(int state) {
        this.state = state;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}
