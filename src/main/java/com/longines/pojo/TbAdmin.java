package com.longines.pojo;

public class TbAdmin {
    private Integer aId;

    private String aname;

    private String aPw;

    private String aTel;

    private String catagory;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getaPw() {
        return aPw;
    }

    public void setaPw(String aPw) {
        this.aPw = aPw == null ? null : aPw.trim();
    }

    public String getaTel() {
        return aTel;
    }

    public void setaTel(String aTel) {
        this.aTel = aTel == null ? null : aTel.trim();
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory == null ? null : catagory.trim();
    }
}