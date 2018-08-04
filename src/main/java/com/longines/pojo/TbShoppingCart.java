package com.longines.pojo;

/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/3 9:11
 * @Version: 1.0
 */
public class TbShoppingCart extends TbShoppingCartKey {
    private Integer gNum;

    private Long tAmount;

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
                "gNum=" + gNum +
                ", tAmount=" + tAmount +
                ", status=" + status +
                '}';
    }
}
