package com.longines.vo;

/**
 * @author  liuyang
 * @since  2018/8/11 21:58
 * @version  1.0
 */
public class TbShoppingCartVo {
    /**
     * 商品ID
     */
    private int gId;
    /**
     * 商家名称
     */
    private String sname;
    /**
     * 商家图片
     */
    private String mPic;
    /**
     * 商品名
     */
    private String gname;
    /**
     * 商品单价
     */
    private Long price;
    /**
     * 商品图片
     */
    private String gPic;
    /**
     * 商品数量
     */
    private int gNum;
    /**
     * 状态号（是否下架）
     */
    private Integer status;
    /**
     * 商品总价（结算时计算）
     */
    private Long tAmount;
    /**
     * 去结算时显示商品总数
     */
    private int tNum;

    private int Bon1;

    private int Bon2;

    private int mId;

    public int getBon1() {
        return Bon1;
    }

    public void setBon1(int bon1) {
        Bon1 = bon1;
    }

    public int getBon2() {
        return Bon2;
    }

    public void setBon2(int bon2) {
        Bon2 = bon2;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getmPic() {
        return mPic;
    }

    public void setmPic(String mPic) {
        this.mPic = mPic;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getgPic() {
        return gPic;
    }

    public int getgNum() {
        return gNum;
    }

    public void setgNum(int gNum) {
        this.gNum = gNum;
    }

    public void setgPic(String gPic) {
        this.gPic = gPic;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long gettAmount() {
        return tAmount;
    }

    public void settAmount(Long tAmount) {
        this.tAmount = tAmount;
    }

    public int gettNum() {
        return tNum;
    }

    public void settNum(int tNum) {
        this.tNum = tNum;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    @Override
    public String toString() {
        return "TbShoppingCartVo{" +
                "gId=" + gId +
                ", sname='" + sname + '\'' +
                ", mPic='" + mPic + '\'' +
                ", gname='" + gname + '\'' +
                ", price=" + price +
                ", gPic='" + gPic + '\'' +
                ", gNum=" + gNum +
                ", status=" + status +
                ", tAmount=" + tAmount +
                ", tNum=" + tNum +
                ", Bon1=" + Bon1 +
                ", Bon2=" + Bon2 +
                ", mId=" + mId +
                '}';
    }
}
