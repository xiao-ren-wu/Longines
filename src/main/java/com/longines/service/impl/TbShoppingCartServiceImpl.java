package com.longines.service.impl;

import com.longines.dao.TbShoppingCartMapper;
import com.longines.pojo.TbShoppingCart;
import com.longines.pojo.TbShoppingCartExample;
import com.longines.pojo.TbShoppingCartKey;
import com.longines.service.TbShoppingCartService;
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
        System.out.println(tbShoppingCartList);
        return tbShoppingCartList;
    }

    /**
     * 更新购物车信息（包含计算总金额）
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

    @Override
    public void deleteShcByPK(int uid, int gid) {
        TbShoppingCartKey tbShoppingCartKey=new TbShoppingCartKey();
        tbShoppingCartKey.setuId(uid);
        tbShoppingCartKey.setgId(gid);
        tbShoppingCartMapper.deleteByPrimaryKey(tbShoppingCartKey);
    }
    @Override
    public void insertShcSelective(int uid,int gid,int gnum,long amount,int statu) {
        TbShoppingCart tbShoppingCart=new TbShoppingCart();
        tbShoppingCart.setuId(uid);
        tbShoppingCart.setgId(gid);
        tbShoppingCart.setgNum(gnum);
        tbShoppingCart.settAmount(amount);
        tbShoppingCart.setStatus(statu);
        tbShoppingCartMapper.insertSelective(tbShoppingCart);
    }
}
