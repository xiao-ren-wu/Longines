package com.longines.service;


import com.longines.pojo.TbCollection;
import com.longines.pojo.TbCollectionKey;

import java.util.List;


/**
* @Description: 
* @Param: 
* @return: 
* @Author: liuchanghui
* @Date: 2018/8/6/006
*/ 


public interface TbcollectionService {
    public void tbCollectionsave(Integer uId,Integer gId);
    public void tbCollectiondelete(Integer uId, Integer gId);
    public List<TbCollection> tbCollectionSelect(Integer uId);

}
