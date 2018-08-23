package com.longines.service.impl;

import com.longines.dao.TbBrandMapper;
import com.longines.pojo.TbBrand;
import com.longines.service.TbBrandMapperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author FengTianHao
 * @version 1.0
 * @since 2018/8/17 16:03
 */
@Service
public class TbBrandMapperServiceImpl implements TbBrandMapperService {
    @Resource(name = "dao1")
    private TbBrandMapper tbBrandMapper;



    @Override
    public List<TbBrand> findAllBrand() {
        List<TbBrand> brandList=tbBrandMapper.findAllBrand();

            return brandList;

    }


}
