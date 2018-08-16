package com.longines.vo;

/**
 * @author leijing
 * @date
 */

public class TbPayVo {
    private Integer uId;



    private String pic;



    private Long aAmount;
    private Integer pId;
    private int state;
    private String msg;

    public String getPic() { return pic; }

    public void setPic(String pic) { this.pic = pic; }


    public int getState() { return state; }

    public void setState(int state) { this.state = state; }

    public String getMsg() { return msg; }

    public void setMsg(String msg) { this.msg = msg; }

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

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}
