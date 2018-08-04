package com.longines.pojo;

public class TbCPic {
    private Integer cId;

    private Integer cInv;

    private String cPic;

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
}