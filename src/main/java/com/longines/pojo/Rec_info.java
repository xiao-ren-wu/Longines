package com.longines.pojo;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class Rec_info {

    private int u_id;       //用户ID
    private int a_id;        //地址ID
    private String consignee;  //收货人名称
    private String s_add;  //收货地址
    private String c_tel;      //收货人电话
    private String postcode;   //邮编
    public int getUser_id() {
        return u_id;
    }
    public void setUser_id(int user_id) {
        this.u_id = user_id;
    }
    public int getAdd_id() {
        return a_id;
    }
    public void setAdd_id(int add_id) {
        this.a_id = add_id;
    }
    public String getConsignee() {
        return consignee;
    }
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }
    public String getS_address() {
        return s_add;
    }
    public void setS_address(String s_address) {
        this.s_add = s_address;
    }
    public String getC_tel() {
        return c_tel;
    }
    public void setC_tel(String c_tel) {
        this.c_tel = c_tel;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    @Override
    public String toString() {
        return "Rec_info [user_id=" + u_id + ", add_id=" + a_id + ", consignee=" + consignee + ", s_address="
                + s_add + ", c_tel=" + c_tel + ", postcode=" + postcode + "]";
    }


}

