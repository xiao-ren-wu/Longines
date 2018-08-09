package com.longines.service.impl;

import com.longines.dao.TbCollectionMapper;
import com.longines.pojo.TbCollection;
import com.longines.pojo.TbCollectionExample;
import com.longines.pojo.TbCollectionKey;
import com.longines.service.TbCollectionService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author    liuchanghui
 *
 * @since     2018/8/8/008 22:41
 * @version   1.0
 */
@Service
public class TbCollectionServiceImpl implements TbCollectionService {

    @Resource
    private TbCollectionMapper tbCollectionMapper;

    @Override
    public void tbCollectionSave(Integer uId,Integer gId) {
        TbCollection tbCollection = tbCollectionMapper.findCollection(gId);
        tbCollection.setgId(gId);
        tbCollection.setuId(uId);
        tbCollection.setPur(0);
        tbCollection.setCollTime(new Date());
        tbCollection.setInvalid(1);
        tbCollectionMapper.insert(tbCollection);
    }


    @Override
    public void tbCollectionDelete(Integer uId, Integer gId) {
        TbCollectionKey tbCollectionKey = new TbCollectionKey();
        tbCollectionKey.setuId(uId);
        tbCollectionKey.setgId(gId);
        tbCollectionMapper.deleteByPrimaryKey(tbCollectionKey);
    }

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

    @Override
    public List<String> tbCollectionSelectPic(Integer uId) {
        List<String> userList = new ArrayList<>();
        TbCollectionExample tbCollectionExample =new TbCollectionExample();
        TbCollectionExample.Criteria criteria = tbCollectionExample.createCriteria();
        criteria.andUIdEqualTo(uId);
        List<TbCollection> tbCollectionList = tbCollectionMapper.selectByExample(tbCollectionExample);
        for (TbCollection tbCollection : tbCollectionList)
        {
           String pic = tbCollectionMapper.findCollectionPic(tbCollection.getgId());
            userList.add(pic);
        }
        return userList;
    }
}
