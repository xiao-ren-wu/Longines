package com.longines.service.impl;

import com.longines.dao.TbCollectionMapper;
import com.longines.pojo.TbCollection;
import com.longines.pojo.TbCollectionExample;
import com.longines.pojo.TbCollectionKey;
import com.longines.service.TbCollectionService;
import com.longines.vo.TbCollectionVo;
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
    public List<TbCollectionVo> tbCollectionSelect(Integer uId) {
        List<TbCollectionVo> tbCollectionVoList =new ArrayList<>();
        TbCollectionExample tbCollectionExample =new TbCollectionExample();
        tbCollectionExample.setOrderByClause("createTime desc");
        TbCollectionExample.Criteria criteria = tbCollectionExample.createCriteria();
        criteria.andUIdEqualTo(uId);
        List<TbCollection> tbCollectionList = tbCollectionMapper.selectByExample(tbCollectionExample);
        for (TbCollection tbCollection : tbCollectionList)
        {
            TbCollectionVo tbCollectionVo = tbCollectionMapper.findCollectionGoods(tbCollection);
            tbCollectionVo.setgId(tbCollection.getgId());
            tbCollectionVo.setuId(tbCollection.getuId());
            TbCollection tbCollection1 = tbCollectionMapper.findCollection(tbCollection.getgId());
            tbCollectionVo.setcPrice(0);
            if(tbCollection.getPur()==0)
            {
                    Integer pur = tbCollectionMapper.collectionPur(tbCollection);
                   if(tbCollection.getgId().equals(pur))
                   {
                       tbCollection.setPur(1);
                       tbCollectionVo.setPur(1);
                   }
            }else
            {
                tbCollectionVo.setPur(1);
            }

                if (tbCollection1.getInvalid()==0)
                    {
                        tbCollectionVo.setInvalid(0);
                        tbCollection.setInvalid(0);
                    }
                else
                    {
                        tbCollectionVo.setInvalid(1);
                        tbCollection.setInvalid(1);
                    }
                if(tbCollection1.getcPrice()<tbCollection.getcPrice())
                    {
                        tbCollectionVo.setcPrice(1);
                    }
                   tbCollectionVo.setgPrice(tbCollection1.getcPrice());
                    tbCollectionMapper.updateByPrimaryKeySelective(tbCollection);
               tbCollectionVoList.add(tbCollectionVo);
        }
        return tbCollectionVoList;
    }
}
