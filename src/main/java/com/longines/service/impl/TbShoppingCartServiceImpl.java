package com.longines.service.impl;

import com.longines.dao.TbShoppingCartMapper;
import com.longines.pojo.*;
import com.longines.service.TbShoppingCartService;
import com.longines.vo.TbShoppingCartVo;
import com.longines.vo.TbShoppingSumVo;
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
    public void insertShcSelective(int uid, int gid) {
        TbShoppingCart tbShoppingCart=new TbShoppingCart();
        tbShoppingCart.setuId(uid);
        tbShoppingCart.setgId(gid);
        tbShoppingCart.setgNum(1);
        tbShoppingCart.setStatus(1);
        tbShoppingCart.settAmount((long) 1);
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
    public TbShoppingCart updateShcBygNum(int uid,int gid, int gNum) {
        TbShoppingCart tbShoppingCart=new TbShoppingCart();
        tbShoppingCart.setuId(uid);
        tbShoppingCart.setgId(gid);
        tbShoppingCart.setgNum(gNum);
        tbShoppingCartMapper.updateBygNum(tbShoppingCart);
        TbShoppingCartKey tbShoppingCartKey=new TbShoppingCartKey();
        tbShoppingCartKey.setuId(uid);
        tbShoppingCartKey.setgId(gid);
        return tbShoppingCart;
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
    public TbShoppingCartVo selectEchoInfo(int uid,int gid) {
        TbShoppingCartVo tbShoppingCartVo=new TbShoppingCartVo();
        tbShoppingCartVo.setgId(gid);

        TbMerce tbMerce=tbShoppingCartMapper.selectMerceInfo(gid);
        tbShoppingCartVo.setSname(tbMerce.getSname());
        tbShoppingCartVo.setmPic(tbMerce.getmPic());

        TbGoodsInfo tbGoodsInfo=tbShoppingCartMapper.selectGoodsInfo(gid);
        tbShoppingCartVo.setGname(tbGoodsInfo.getGname());
        tbShoppingCartVo.setgPic(tbGoodsInfo.getgPic());
        tbShoppingCartVo.setPrice(tbGoodsInfo.getPrice());

        TbShoppingCartKey tbShoppingCartKey=new TbShoppingCartKey();
        tbShoppingCartKey.setuId(uid);
        tbShoppingCartKey.setgId(gid);
        System.out.println(tbShoppingCartMapper.selectgNum(tbShoppingCartKey));

        tbShoppingCartVo.setgNum(tbShoppingCartMapper.selectgNum(tbShoppingCartKey));
        tbShoppingCartVo.settAmount(tbShoppingCartMapper.selectgNum(tbShoppingCartKey)*tbGoodsInfo.getPrice());
        tbShoppingCartVo.settNum(1);
        tbShoppingCartVo.setStatus(tbShoppingCartMapper.selectStatus(tbShoppingCartKey));
        return tbShoppingCartVo;
    }


    @Override
    public List<TbShoppingCartVo> selectEcho(int uid){
        List<TbShoppingCartVo> tbShoppingCartVoList=new ArrayList<>();
        TbShoppingCartExample tbShoppingCartExample=new TbShoppingCartExample();
        TbShoppingCartExample.Criteria criteria=tbShoppingCartExample.createCriteria();
        criteria.andUIdEqualTo(uid);
        List<TbShoppingCart> tbShoppingCartList=tbShoppingCartMapper.selectByExample(tbShoppingCartExample);
        for(TbShoppingCart tbShoppingCart:tbShoppingCartList){
             TbShoppingCartVo tbShoppingCartVo =selectEchoInfo(uid,tbShoppingCart.getgId());
             tbShoppingCartVoList.add(tbShoppingCartVo);
        }
        return tbShoppingCartVoList;
    }

    @Override
    public int sumShcgNum(int uid, int gid) {
        TbShoppingCartKey tbShoppingCartKey=new TbShoppingCartKey();
        tbShoppingCartKey.setuId(uid);
        tbShoppingCartKey.setgId(gid);
        return tbShoppingCartMapper.selectgNum(tbShoppingCartKey);

    }

    @Override
    public Long sumShctAmount(int uid, int gid) {
        TbShoppingCartKey tbShoppingCartKey=new TbShoppingCartKey();
        tbShoppingCartKey.setuId(uid);
        tbShoppingCartKey.setgId(gid);
        return tbShoppingCartMapper.selectgNum(tbShoppingCartKey)*tbShoppingCartMapper.selectPrice(gid);

    }

}
