package com.longines.pojo;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class Order {

    private int o_id;      //订单ID
    private int g_id;      //商品ID
    private int g_num;         //商品数量

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public int getG_num() {
        return g_num;
    }

    public void setG_num(int g_num) {
        this.g_num = g_num;
    }

    @Override
    public String toString() {
        return "Order{" +
                "o_id=" + o_id +
                ", g_id=" + g_id +
                ", g_num=" + g_num +
                '}';
    }
}

