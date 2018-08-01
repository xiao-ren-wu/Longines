package com.longines.pojo;


public class OrderInfo {
    private int o_id;       //订单ID
    private double a_amount;    //总金额
    private double freight;     //运费
    private int s_num;      //状态号
    public int getOrder_id() {
        return o_id;
    }
    public void setOrder_id(int order_id) {
        this.o_id = order_id;
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
    @Override
    public String toString() {
        return "order_info [order_id=" + o_id + ", a_amount=" + a_amount + ", freight="
                + freight + ", state_num=" + s_num + "]";
    }
}
