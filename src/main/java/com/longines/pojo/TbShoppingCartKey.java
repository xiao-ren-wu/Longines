package com.longines.pojo;

/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/3 9:09
 * @Version: 1.0
 */
public class TbShoppingCartKey {
    /**
     * 用户ID
     */
    protected Integer uId;
    /**
     * 商品ID
     */
    protected Integer gId;

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
}
