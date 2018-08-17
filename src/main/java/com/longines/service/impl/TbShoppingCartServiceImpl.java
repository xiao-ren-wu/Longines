package com.longines.service.impl;

import com.longines.dao.TbShoppingCartMapper;
import com.longines.pojo.*;
import com.longines.service.TbShoppingCartService;
import com.longines.vo.TbShoppingCartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public void insertShcSelective(int uid,int gid) {
        TbShoppingCart tbShoppingCart=new TbShoppingCart();
        tbShoppingCart.setuId(uid);
        tbShoppingCart.setgId(gid);
        tbShoppingCart.setgNum(1);
        tbShoppingCart.setStatus(1);
        tbShoppingCartMapper.insertSelective(tbShoppingCart);
        tbShoppingCartMapper.updateTamount(tbShoppingCart);
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
        for(TbShoppingCart tbShoppingCart:tbShoppingCartList){
            System.out.println(tbShoppingCart.getgId());
        }
        return tbShoppingCartList;
    }


    @Override
    public TbShoppingCartVo selectEchoInfo(int gid) {
        TbShoppingCartVo tbShoppingCartVoo=new TbShoppingCartVo();
        tbShoppingCartVoo.setgId(gid);
        TbMerce tbMerce=tbShoppingCartMapper.selectMerceInfo(gid);
        tbShoppingCartVoo.setSname(tbMerce.getSname());
        tbShoppingCartVoo.setmPic(tbMerce.getmPic());
        TbGoodsInfo tbGoodsInfo=tbShoppingCartMapper.selectGoodsInfo(gid);
        tbShoppingCartVoo.setGname(tbGoodsInfo.getGname());
        tbShoppingCartVoo.setgPic(tbGoodsInfo.getgPic());
        tbShoppingCartVoo.setPrice(tbGoodsInfo.getPrice());
        tbShoppingCartVoo.settNum(1);
        tbShoppingCartVoo.settAmount(tbGoodsInfo.getPrice());
        tbShoppingCartVoo.setStatus(tbShoppingCartMapper.selectStatus(gid));
        return tbShoppingCartVoo;
    }


    @Override
    public List<TbShoppingCartVo> selectEcho(int uid){
        List<TbShoppingCartVo> tbShoppingCartVoList=new ArrayList<>();
        TbShoppingCartExample tbShoppingCartExample=new TbShoppingCartExample();
        TbShoppingCartExample.Criteria criteria=tbShoppingCartExample.createCriteria();
        criteria.andUIdEqualTo(uid);
        List<TbShoppingCart> tbShoppingCartList=tbShoppingCartMapper.selectByExample(tbShoppingCartExample);
        for(TbShoppingCart tbShoppingCart:tbShoppingCartList){
             TbShoppingCartVo tbShoppingCartVo  =selectEchoInfo(tbShoppingCart.getgId());
             tbShoppingCartVoList.add(tbShoppingCartVo);
        }
        return tbShoppingCartVoList;
    }

}
