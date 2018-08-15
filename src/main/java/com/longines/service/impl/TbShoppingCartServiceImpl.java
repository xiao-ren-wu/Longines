package com.longines.service.impl;

import com.longines.dao.TbShoppingCartMapper;
import com.longines.pojo.TbShoppingCart;
import com.longines.pojo.TbShoppingCartExample;
import com.longines.pojo.TbShoppingCartKey;
import com.longines.service.TbShoppingCartService;
import com.longines.vo.TbShoppingCartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author  liuyang
 * @since  2018/8/6 12:07
 * @version  1.0
 */
@Service
public class TbShoppingCartServiceImpl implements TbShoppingCartService {
    @Autowired
    private TbShoppingCartMapper tbShoppingCartMapper;

    @Override
    public void insertShcSelective(int uid,int gid,int gnum,long amount) {
        TbShoppingCart tbShoppingCart=new TbShoppingCart();
        tbShoppingCart.setuId(uid);
        tbShoppingCart.setgId(gid);
        tbShoppingCart.setgNum(gnum);
        tbShoppingCart.settAmount(amount);
        tbShoppingCart.setStatus(1);
        tbShoppingCartMapper.insertSelective(tbShoppingCart);
    }

    @Override
    public void deleteShcByPK(int uid, int gid) {
        TbShoppingCartKey tbShoppingCartKey=new TbShoppingCartKey();
        tbShoppingCartKey.setuId(uid);
        tbShoppingCartKey.setgId(gid);
        tbShoppingCartMapper.deleteByPrimaryKey(tbShoppingCartKey);
    }

    /**
     * 更新购物车信息
     *
     */
    @Override
    public void updateShcBygNum(int uid,int gid, int gNum) {
        TbShoppingCart tbShoppingCart=new TbShoppingCart();
        tbShoppingCart.setuId(uid);
        tbShoppingCart.setgId(gid);
        tbShoppingCart.setgNum(gNum);
        tbShoppingCartMapper.updateBygNum(tbShoppingCart);
    }
    /**
     * 根据用户ID查询购物车信息
     *
     */
    @Override
    public List<TbShoppingCart> selectShcByUid(int uid) {
        TbShoppingCartExample tbShoppingCartExample=new TbShoppingCartExample();
        TbShoppingCartExample.Criteria criteria=tbShoppingCartExample.createCriteria();
        criteria.andUIdEqualTo(uid);
        List<TbShoppingCart> tbShoppingCartList=tbShoppingCartMapper.selectByExample(tbShoppingCartExample);
        return tbShoppingCartList;
    }


    @Override
    public TbShoppingCartVo selectEchoInfo(int gid) {
        TbShoppingCartVo tbShoppingCartVoo=new TbShoppingCartVo();
        tbShoppingCartVoo.setgId(gid);
        tbShoppingCartVoo=tbShoppingCartMapper.selectMerceInfo(gid);
        String sName=tbShoppingCartVoo.getSname();
        String mPic=tbShoppingCartVoo.getmPic();
        int Status=tbShoppingCartMapper.selectStatus(4);
        TbShoppingCartVo tbShoppingCartVo=tbShoppingCartMapper.selectGoodsInfo(gid);
        tbShoppingCartVo.setSname(sName);
        tbShoppingCartVo.setmPic(mPic);
        tbShoppingCartVo.setStatus(Status);
        return tbShoppingCartVo;
    }

}
