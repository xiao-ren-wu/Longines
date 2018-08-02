package com.longines.pojo;

import java.util.Date;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class Order_info {
    private int o_id;       //订单ID
    private int u_id;        //用户ID
    private int a_id;         //地址ID
    private Date cre_date;      //创建日期
    private Date del_date;      //发货日期
    private Date td_date;       //收货日期
    private double a_amount;    //总金额
    private double freight;     //运费
    private int s_num;      //状态号
    private String d_method; //配送方式
    public int getOrder_id() {
        return o_id;
    }
    public void setOrder_id(int order_id) {
        this.o_id = order_id;
    }
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
    public Date getCre_date() {
        return cre_date;
    }
    public void setCre_date(Date cre_date) {
        this.cre_date = cre_date;
    }
    public Date getDel_date() {
        return del_date;
    }
    public void setDel_date(Date del_date) {
        this.del_date = del_date;
    }
    public Date getTd_date() {
        return td_date;
    }
    public void setTd_date(Date td_date) {
        this.td_date = td_date;
    }
    public double getA_amount() {
        return a_amount;
    }
    public void setA_amount(double a_amount) {
        this.a_amount = a_amount;
    }
    public double getFreight() {
        return freight;
    }
    public void setFreight(double freight) {
        this.freight = freight;
    }
    public int getState_num() {
        return s_num;
    }
    public void setState_num(int state_num) {
        this.s_num = state_num;
    }
    public String getDisp_method() {
        return d_method;
    }
    public void setDisp_method(String disp_method) {
        this.d_method = disp_method;
    }
    @Override
    public String toString() {
        return "Order_info [order_id=" + o_id + ", user_id=" + u_id + ", add_id=" + a_id + ", cre_date="
                + cre_date + ", del_date=" + del_date + ", td_date=" + td_date + ", a_amount=" + a_amount + ", freight="
                + freight + ", state_num=" + s_num + ", disp_method=" + d_method + "]";
    }
}

