package com.longines.service;


import com.longines.pojo.TbCollection;

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
     *
     *@param   uId sad
     * @param gId gid
     */
    void tbCollectionSave(Integer uId,Integer gId);
    /**
     * 方法注释
     *
     * @param   uId 不回家比较
     * @param   gId 一个
     */
    void tbCollectionDelete(Integer uId, Integer gId);

    /**
     * 方法注释
     *
     *@param   uId uio
     *@return   java.util.List<com.longines.pojo.TbCollection>
     */
    List<TbCollection> tbCollectionSelect(Integer uId);


}
