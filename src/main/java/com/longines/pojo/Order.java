package com.longines.pojo;

public class Order {
    private int o_id;      //订单ID
    private int g_id;      //商品ID
    private int g_num;         //商品数量
    public int getOrder_id() {
        return o_id;
    }
    public void setOrder_id(int order_id) {
        this.o_id = order_id;
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
    @Override
    public String toString() {
        return "order [order_id=" + o_id + ", goods_id=" + g_id + ", g_num=" + g_num + "]";
    }

}
