package com.longines.service.impl;

import com.longines.dao.TbRecInfoMapper;
import com.longines.pojo.TbRecInfo;
import com.longines.pojo.TbRecInfoExample;
import com.longines.pojo.TbRecInfoKey;
import com.longines.service.TbRecInfoService;

import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;
/**
 * TbRecInfoServiceImpl
 *
 * @author wangyichao
 * @date 2018/8/14
 */

@Service
public class TbRecInfoServiceImpl implements TbRecInfoService {

    @Resource(name = "dao")
    protected  TbRecInfoMapper Mapper;

    @Override
    public int updateByPrimaryKeySelective(TbRecInfo record) {

        try {
            Mapper.updateByPrimaryKeySelective(record);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int deleteByPrimaryKey(TbRecInfoKey key) {
        try {
            Mapper.deleteByPrimaryKey(key);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int insert(TbRecInfo record) {
        try {
            Mapper.insert(record);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public List<TbRecInfo> selectByExample(TbRecInfoExample example) {
        List<TbRecInfo> Info = Mapper.selectByExample(example);
        if(Info == null){
            return null;
        }else{
            return Info;
        }
    }

    @Override
    public int selectByPrimaryKey(TbRecInfoKey key){

        try {
            Mapper.selectByPrimaryKey(key);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}
