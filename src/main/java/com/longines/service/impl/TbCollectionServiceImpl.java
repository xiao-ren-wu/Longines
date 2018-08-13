package com.longines.service.impl;

import com.longines.dao.TbCollectionMapper;
import com.longines.pojo.TbCollection;
import com.longines.pojo.TbCollectionExample;
import com.longines.pojo.TbCollectionKey;
import com.longines.pojo.TbGoodsInfo;
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
        TbCollectionVo tbCollectionVo = new TbCollectionVo();
        List<TbCollectionVo> tbCollectionVoList =new ArrayList<>();
        TbCollectionExample tbCollectionExample =new TbCollectionExample();
        TbCollectionExample.Criteria criteria = tbCollectionExample.createCriteria();
        criteria.andUIdEqualTo(uId);
        List<TbCollection> tbCollectionList = tbCollectionMapper.selectByExample(tbCollectionExample);
        for (TbCollection tbCollection : tbCollectionList)
        {
            TbGoodsInfo tbGoodsInfo = tbCollectionMapper.findCollectionGoods(tbCollection.getgId());
            tbCollectionVo.setcPrice(0);
            tbCollectionVo.setgId(tbCollection.getgId());
            tbCollectionVo.setuId(tbCollection.getuId());
            tbCollectionVo.setgName(tbGoodsInfo.getGname());
            tbCollectionVo.setInvalid(1);
            tbCollectionVo.setPic(tbGoodsInfo.getgPic());
            tbCollectionVo.setPur(0);
               if(tbCollection.getInvalid()!=0)
               {
                    TbCollection tbCollection1 = tbCollectionMapper.findCollection(tbCollection.getgId());
                    if (tbCollection1.getInvalid()==0) {
                        tbCollectionVo.setInvalid(0);
                        tbCollection.setInvalid(0);
                    }
                    if(tbCollection1.getcPrice()<tbCollection.getcPrice())
                    {
                        tbCollectionVo.setGpic(tbCollection1.getcPrice());
                        tbCollectionVo.setcPrice(1);
                    }
                    tbCollectionMapper.updateByPrimaryKeySelective(tbCollection);
               }
               tbCollectionVoList.add(tbCollectionVo);
        }
        return tbCollectionVoList;
    }


}
