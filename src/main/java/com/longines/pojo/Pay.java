package com.longines.pojo;

import java.util.Date;

public class Pay {
    private int p_id;          //支付ID
    private int u_id;         //用户ID
    private int o_id;        //订单ID
    private String p_method;   //支付方式
    private String t_num;     //交易号
    private Date pm_date;        //付款日期
    public int getPay_id() {
        return p_id;
    }
    public void setPay_id(int pay_id) {
        this.p_id = pay_id;
    }
    public int getUser_id() {
        return u_id;
    }
    public void setUser_id(int user_id) {
        this.u_id = user_id;
    }
    public int getOrder_id() {
        return o_id;
    }
    public void setOrder_id(int order_id) {
        this.o_id = order_id;
    }
    public String getPay_method() {
        return p_method;
    }
    public void setPay_method(String pay_method) {
        this.p_method = pay_method;
    }
    public String getTran_num() {
        return t_num;
    }
    public void setTran_num(String tran_num) {
        this.t_num = tran_num;
    }
    public Date getPm_date() {
        return pm_date;
    }
    public void setPm_date(Date pm_date) {
        this.pm_date = pm_date;
    }
    @Override
    public String toString() {
        return "pay [pay_id=" + p_id + ", user_id=" + u_id + ", order_id=" + o_id + ", pay_method="
                + p_method + ", tran_num=" + t_num + ", pm_date=" + pm_date + "]";
    }
}
