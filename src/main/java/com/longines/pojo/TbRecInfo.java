package com.longines.pojo;


/**
 * TbRecInfo
 *
 * @author wangyichao
 * @date 2018/8/8
 */

public class TbRecInfo extends TbRecInfoKey {
    private String consignee;

    private String sAdd;

    private String cTel;

    private String postcode;

    private String province;

    private String city;

    private String district;

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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();

    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }
}