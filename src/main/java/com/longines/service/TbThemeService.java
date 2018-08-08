package com.longines.service;
/**
 * @author weiyi
 * @since 2018-08-08 22:21
 * @version 1.0
 */
public interface TbThemeService {

    /**
     * @return int
     * @param the_des 主题描述
     */
    int SelectThe_id(String the_des);

    /**
     * @return java.lang.String
     * @param the_des 主题描述
     */
    String SelectThe_Pic(String the_des);

}
