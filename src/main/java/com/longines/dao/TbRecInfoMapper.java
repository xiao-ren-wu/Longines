package com.longines.dao;

import com.longines.pojo.TbRecInfo;
import com.longines.pojo.TbRecInfoExample;
import com.longines.pojo.TbRecInfoKey;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TbRecInfoMapper
 *
 * @author wangyichao
 * @date 2018/8/8
 */


@Repository("dao")
public interface TbRecInfoMapper {
    /**
     * 通过动态sql查询
     *
     * @param   record 将参数封装进对象中
     * @return   int
     */
    int updateByPrimaryKeySelective(TbRecInfo record);
    /**
     * 将uid，aid封装到对象中，进行删除
     *
     * @param   key 将参数封装进对象中
     * @return   int
     */
    int deleteByPrimaryKey(TbRecInfoKey key);
    /**
     * 新建一个对象，将所有的参数输入进参数，实现插入
     *
     * @param   record 将参数封装进对象中
     * @return   int
     */
    int insert(TbRecInfo record);

    /**
     * 通过u_id,a_id联合查询
     *
     * @param   key 将参数封装进对象中
     * @return   int
     */
    int selectByPrimaryKey(TbRecInfoKey key);

    /**
     * 自定义查询
     *
     * @param   example   通过example对象定义方法
     * @return   java.util.List<com.longines.pojo.TbRecInfo>
     */
    List<TbRecInfo> selectByExample(TbRecInfoExample example);
    //    int insertSelective(TbRecInfo record);
    //    TbRecInfo selectByPrimaryKey(TbRecInfoKey key);

    //    int updateByExampleSelective(@Param("record") TbRecInfo record, @Param("example") TbRecInfoExample example);

    //    int updateByExample(@Param("record") TbRecInfo record, @Param("example") TbRecInfoExample example);

    //   int updateByPrimaryKey(TbRecInfo record);
    //    int countByExample(TbRecInfoExample example);
    //    int deleteByExample(TbRecInfoExample example);
}