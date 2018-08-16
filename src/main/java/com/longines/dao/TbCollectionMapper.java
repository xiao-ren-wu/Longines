package com.longines.dao;

import com.longines.pojo.TbCollection;
import com.longines.pojo.TbCollectionExample;
import com.longines.pojo.TbCollectionKey;
import com.longines.vo.TbCollectionVo;

import java.util.List;

/**
 * @author    liuchanghui
 * Dao层接口
 * @since     2018/8/8/008 22:39
 * @version   1.0
 */
public interface TbCollectionMapper {

    /**
     * 方法注释
     *
     *@param   key sad
     */
    void deleteByPrimaryKey(TbCollectionKey key);
    /**
     * 方法注释
     *
     *@param   record  ssa
     */
    void insert(TbCollection record);
    /**
     * 方法注释
     *
     *@param   find www
     *@return   com.longines.pojo.TbCollection
     */
    TbCollection findCollection(Integer find);

    /**
     * 方法注释
     *
     *@param   example  ii
     *@return   java.util.List<com.longines.pojo.TbCollection>
     */
    List<TbCollection> selectByExample(TbCollectionExample example);
    /**
     * 方法注释
     *
     *@param   record ss
     */
    void updateByPrimaryKeySelective(TbCollection record);
    /**
     * 方法注释
     *查找商品的pic
     *@param   tbCollection  收藏里所需信息
     *@return   java.lang.String
     */
    TbCollectionVo findCollectionGoods(TbCollection tbCollection);
  /**
     * 方法注释
     *
     *@param   tbCollection ss
     *@return   java.util.List<java.lang.Integer>
     */
    Integer collectionPur(TbCollection tbCollection);

}