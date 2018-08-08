package com.longines.dao;



import org.springframework.stereotype.Repository;

/**
 * @author weiyi
 * @since 2018-08-08 21:41
 * @version 1.0
 */
@Repository("Themedao")
public interface TbGoodsTheMapper {
    /**
     * @return int
     * @param theDes 主题描述
     */
    int selectTheidBytheDes(String theDes);

    /**
     * @return java.lang.String
     * @param theDes 主题描述
     */
    String selectThepicBythDes(String theDes);

}