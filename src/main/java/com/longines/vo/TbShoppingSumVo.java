package com.longines.vo;

/**
 * @author  liuyang
 * @since  2018/8/15 15:51
 * @version  1.0
 */
public class TbShoppingSumVo {
    private int uId;

    private int gId;

    private int tNum;

    private Long tAmount;

    private int status;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public int gettNum() {
        return tNum;
    }

    public void settNum(int tNum) {
        this.tNum = tNum;
    }

    public Long gettAmount() {
        return tAmount;
    }

    public void settAmount(Long tAmount) {
        this.tAmount = tAmount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TbShoppingSumVo{" +
                "uId=" + uId +
                ", gId=" + gId +
                ", tNum=" + tNum +
                ", tAmount=" + tAmount +
                ", status=" + status +
                '}';
    }
}
