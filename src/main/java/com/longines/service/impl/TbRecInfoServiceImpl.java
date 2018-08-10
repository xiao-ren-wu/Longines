package com.longines.service.impl;

import com.longines.dao.TbRecInfoMapper;
import com.longines.pojo.TbRecInfo;
import com.longines.pojo.TbRecInfoExample;
import com.longines.pojo.TbRecInfoKey;
import com.longines.service.TbRecInfoService;

import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class TbRecInfoServiceImpl implements TbRecInfoService {

    @Resource(name = "dao")
    protected  TbRecInfoMapper Mapper;

    @Override
    public int updateByPrimaryKeySelective(TbRecInfo record) {

        Mapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(TbRecInfoKey key) {
        Mapper.deleteByPrimaryKey(key);
        return 0;

    }

    @Override
    public int insert(TbRecInfo record) {
        Mapper.insert(record);
        return 0;
    }

    @Override
    public List<TbRecInfo> selectByExample(TbRecInfoExample example) {
        List<TbRecInfo> Info = Mapper.selectByExample(example);
        return Info;
    }

    @Override
    public int selectByPrimaryKey(TbRecInfoKey key){
        Mapper.selectByPrimaryKey(key);
        return 0;
    }
}
