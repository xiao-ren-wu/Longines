package com.longines.pojo;

/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/3 9:09
 * @Version: 1.0
 */
public class TbShoppingCartKey {
    private Integer uId;

    private Integer gId;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    @Override
    public String toString() {
        return "TbShoppingCartKey{" +
                "uId=" + uId +
                ", gId=" + gId +
                '}';
    }
}