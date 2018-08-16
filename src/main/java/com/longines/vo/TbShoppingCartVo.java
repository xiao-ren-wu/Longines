package com.longines.vo;

/**
 * @author  liuyang
 * @since  2018/8/11 21:58
 * @version  1.0
 */
public class TbShoppingCartVo {
    private int gId;

    private String sname;

    private String mPic;

    private String gname;

    private Long price;

    private String gPic;

    private Integer status;

    private Long tAmount;
    /**
     * 去结算时显示商品总数
     */
    private int tNum;

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

    @Override
    public String toString() {
        return "TbShoppingCartVo{" +
                "sname='" + sname + '\'' +
                ", mPic='" + mPic + '\'' +
                ", gname='" + gname + '\'' +
                ", price=" + price +
                ", gPic='" + gPic + '\'' +
                ", status=" + status +
                ", tAmount=" + tAmount +
                ", tNum=" + tNum +
                '}';
    }
}
