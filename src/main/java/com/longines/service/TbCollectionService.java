package com.longines.service;


import com.longines.pojo.TbCollectionKey;
import com.longines.vo.TbCollectionVo;

import java.util.List;

/**
 * @author    liuchanghui
 *
 * @since     2018/8/8/008 22:42
 * @version   1.0
 */
public interface TbCollectionService {
    /**
     * 方法注释
     *添加收藏
     *@param   uId 用户id
     * @param gId   商品id
     */
    void tbCollectionSave(Integer uId, Integer gId);
    /**
     * 方法注释
     *删除收藏
     * @param   uId 用户id
     * @param   gId 商品id
     */
    void tbCollectionDelete(Integer uId, Integer gId);

    /**
     * 方法注释
     *我的收藏
     *@param   uId 用户id
     *@return   java.util.List<com.longines.pojo.TbCollection>
     */
    List<TbCollectionVo> tbCollectionSelect(Integer uId);
    /**
     * 方法注释
     *
     *@param   tbCollectionKey 收藏主键
     *@return   boolean
     */
    boolean tbCollectionFind(TbCollectionKey tbCollectionKey);


}
