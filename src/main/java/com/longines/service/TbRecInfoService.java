package com.longines.service;

import com.longines.pojo.TbRecInfo;
import com.longines.pojo.TbRecInfoExample;
import com.longines.pojo.TbRecInfoKey;

import java.util.List;

/**
 * TbRecInfoService
 *
 * @author wangyichao
 * @date 2018/8/14
 */

public interface TbRecInfoService {
    /**
     * 更新数据
     *
     * @param   record  将修改过的参数封装进record进行更新数据
     * @return   int
     */
    int updateByPrimaryKeySelective(TbRecInfo record);
    /**
     * 删除数据
     *
     * @param   key 将u_id，a_id封装进key中
     * @return   int
     */
    int deleteByPrimaryKey(TbRecInfoKey key);
    /**
     * 插入数据
     *
     * @param   record  将参数封装进record
     * @return   int
     */
    int insert(TbRecInfo record);
    /**
     * 查找数据
     *
     * @param   key 将u_id，a_id封装进key中
     * @return   int
     */
    int selectByPrimaryKey(TbRecInfoKey key);
    /**
     * 自定义查询
     *
     * @param   example 创建example对象实现自定义查询
     * @return   java.util.List<com.longines.pojo.TbRecInfo>
     */
    List<TbRecInfo> selectByExample(TbRecInfoExample example);

}