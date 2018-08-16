package com.longines.pojo;

import java.util.Date;

/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/3 9:11
 * @Version: 1.0
 */
public class TbShoppingCart extends TbShoppingCartKey {
    /**
     * 商品数量
     */
    private Integer gNum;
    /**
     * 总金额
     */
    private Long tAmount;
    /**
     * 状态号
     */
    private Integer status;


    public Integer getgNum() {
        return gNum;
    }

    public void setgNum(Integer gNum) {
        this.gNum = gNum;
    }

    public Long gettAmount() {
        return tAmount;
    }

    public void settAmount(Long tAmount) {
        this.tAmount = tAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TbShoppingCart{" +
                "uId=" + uId +
                ", gId=" + gId +
                ", gNum=" + gNum +
                ", tAmount=" + tAmount +
                ", status=" + status +
                '}';
    }
}
