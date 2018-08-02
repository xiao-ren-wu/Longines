package com.longines.service.impl;

import com.longines.dao.UserMapper;
import com.longines.pojo.CollectionA;
import com.longines.pojo.CollectionB;
import com.longines.service.UserService;

/**
 * @author XiaoRenwu
 * e-mail 18629015421@163.com
 * github https://github.com/xiao-ren-wu
 * @version 1
 * @since 2018/7/8 23:24
 */

public class App implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void save(Integer id) {
        CollectionB collectionB=userMapper.findCollection(id);

    }

    @Override
    public void delete() {

    }
}
