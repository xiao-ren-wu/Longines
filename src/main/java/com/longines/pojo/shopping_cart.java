package com.longines.pojo;

public class shopping_cart {
<<<<<<< HEAD
    private int u_id;
    private int g_id;
    private int g_num;
    private double t_amount;
    private int status;
=======
    private int u_id;      //用户ID
    private int g_id;     //商品ID
    private int g_num;        //商品数量
    private double t_amount;  //总金额
    private int status;       //状态号
>>>>>>> 0fd1e24d83ff183679af25f965a3a6455e88cddf

    public int getUser_id() {
        return u_id;
    }

    public void setUser_id(int user_id) {
        this.u_id = user_id;
    }

    public int getGoods_id() {
        return g_id;
    }

    public void setGoods_id(int goods_id) {
        this.g_id = goods_id;
    }

    public int getG_num() {
        return g_num;
    }

    public void setG_num(int g_num) {
        this.g_num = g_num;
    }

    public double getT_amount() {
        return t_amount;
    }

    public void setT_amount(double t_amount) {
        this.t_amount = t_amount;
    }

<<<<<<< HEAD
    public void setS_status(int s_status) {
        this.status = s_status;
    }

    public int getS_status(int i) {
        return status;
=======
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
>>>>>>> 0fd1e24d83ff183679af25f965a3a6455e88cddf
    }

    @Override
    public String toString() {
        return "shopping_cart [user_id=" + u_id + ", goods_id=" + g_id + ", g_num=" + g_num + ", t_amount="
                + t_amount + ", status=" + status + "]";
    }
}

