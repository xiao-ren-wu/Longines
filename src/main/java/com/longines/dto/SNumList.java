package com.longines.dto;

public class SNumList {
    private String Sname;
    private String mPic;
    private String Gname;
    private String gPic;
    private long Price;
    private Integer oId;

    public Integer getoId() { return oId; }

    public void setoId(Integer oId) { this.oId = oId; }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getmPic() {
        return mPic;
    }

    public void setmPic(String mPic) {
        this.mPic = mPic;
    }

    public String getGname() {
        return Gname;
    }

    public void setGname(String gname) {
        Gname = gname;
    }

    public String getgPic() {
        return gPic;
    }

    public void setgPic(String gPic) {
        this.gPic = gPic;
    }

    public long getPrice() {
        return Price;
    }

    public void setPrice(long price) {
        Price = price;
    }
}
