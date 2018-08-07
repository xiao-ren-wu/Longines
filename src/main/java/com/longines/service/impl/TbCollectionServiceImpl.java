package com.longines.service.impl;

import com.longines.dao.TbCollectionMapper;
import com.longines.pojo.TbCollection;
import com.longines.pojo.TbCollectionExample;
import com.longines.pojo.TbCollectionKey;
import com.longines.service.TbcollectionService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author liuchanghui
 * @Title: TbCollectionServiceImpl
 * @ProjectName Longines
 * @Description: TODO
 * @date 2018/8/5/005  16:48
 */

@Service
public class TbCollectionServiceImpl implements TbcollectionService {

    @Resource
    private TbCollectionMapper tbCollectionMapper;

    /**
     *
     * @param
     */
    @Override
    public void tbCollectionsave(Integer uId,Integer gId) {
        TbCollection tbCollection = tbCollectionMapper.findCollection(gId);
        tbCollection.setgId(gId);
        tbCollection.setuId(uId);
        tbCollection.setPur(0);
        tbCollection.setCollTime(new Date());
        tbCollection.setInvalid(1);
        tbCollectionMapper.insert(tbCollection);
    }

    /**
     * 删除收藏
     * @param
     */
    @Override
    public void tbCollectiondelete(Integer uId, Integer gId) {
        TbCollectionKey tbCollectionKey = new TbCollectionKey();
        tbCollectionKey.setuId(uId);
        tbCollectionKey.setgId(gId);
        tbCollectionMapper.deleteByPrimaryKey(tbCollectionKey);
    }

    /**
     *
     * @param uId
     * @return tbCollectionList
     */
    @Override
    public List<TbCollection> tbCollectionSelect(Integer uId) {
        TbCollectionExample tbCollectionExample =new TbCollectionExample();
        TbCollectionExample.Criteria criteria = tbCollectionExample.createCriteria();
        criteria.andUIdEqualTo(uId);
        List<TbCollection> tbCollectionList = tbCollectionMapper.selectByExample(tbCollectionExample);
        for (TbCollection tbCollection : tbCollectionList)
        {
               if(tbCollection.getInvalid()!=0)
               {
                   System.out.println("大家好"+tbCollection.getuId());
                    TbCollection tbCollection1 = tbCollectionMapper.findCollection(tbCollection.getgId());
                    if (tbCollection1.getInvalid()==0) {
                        tbCollection.setInvalid(0);
                    }
                    if(!tbCollection1.getcPrice().equals(tbCollection.getcPrice()))
                    {
                       tbCollection.setcPrice(tbCollection1.getcPrice());
                    }
                    tbCollectionMapper.updateByPrimaryKeySelective(tbCollection);
               }
        }
        return tbCollectionList;
    }
}
