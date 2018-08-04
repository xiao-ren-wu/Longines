package com.longines.pojo;

public class TbRecInfo extends TbRecInfoKey {
    private String consignee;

    private String sAdd;

    private String cTel;

    private String postcode;

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getsAdd() {
        return sAdd;
    }

    public void setsAdd(String sAdd) {
        this.sAdd = sAdd == null ? null : sAdd.trim();
    }

    public String getcTel() {
        return cTel;
    }

    public void setcTel(String cTel) {
        this.cTel = cTel == null ? null : cTel.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }
}