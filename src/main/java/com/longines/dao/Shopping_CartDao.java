package com.longines.dao;

import com.longines.pojo.shopping_cart;

/**
 * @author XiaoRenwu
 * e-mail 18629015421@163.com
 * github https://github.com/xiao-ren-wu
 * @version 1
 * @since 2018/7/8 23:54
 */
//@Component
public interface Shopping_CartDao {
//    public good_info findg_info(int id) throws Exception;
      public void insertsc(shopping_cart sc) throws Exception;
      public void addUser();// DItest
      //**根据用户ID查询sc信息
      public shopping_cart findScByUid(int id)throws Exception;
}
