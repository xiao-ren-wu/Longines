package com.longines.service.impl;

import com.longines.dao.TbMerceMapper;
import com.longines.pojo.TbMerce;
import com.longines.service.TbMerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * @author   yangshuai
 * @description   商家详细信息接口
 * @since    2018/8/9 1:14
 * @version  1.0
 */
@Service
public class TbMerceServiceImpl implements TbMerceService {
    @Autowired
    private TbMerceMapper tbMerceMapper;
    @Override
    public List<TbMerce> selectBymId(List<Integer> mId) {
        List<TbMerce> list=new ArrayList<>();
        for (int i=0;i<mId.size();i++)
        {
            list.add(tbMerceMapper.selectByPrimaryKey(mId.get(i)));
        }
        return list;
    }
}
