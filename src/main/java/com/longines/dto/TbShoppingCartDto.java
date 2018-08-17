package com.longines.dto;

import java.util.List;

/**
 * 用于批量删除时传递指定用户ID和多个商品ID
 * @author  liuyang
 * @since  2018/8/17 21:22
 * @version  1.0
 */
public class TbShoppingCartDto {

    protected Integer uId;

    protected List<Integer> gId;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public List<Integer> getgId() {
        return gId;
    }

    public void setgId(List<Integer> gId) {
        this.gId = gId;
    }
}
