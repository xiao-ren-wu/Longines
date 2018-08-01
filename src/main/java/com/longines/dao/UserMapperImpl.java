package com.longines.dao;

import com.longines.pojo.CollectionA;
import com.longines.pojo.CollectionB;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public CollectionB findCollection(Integer id) {
        return this.getSqlSession().selectOne("com.longines.dao.UserMapper.findCollection",id);
    }

    @Override
    public void saveCollection(CollectionA collectiona) {
        this.getSqlSession().insert("com.longines.dao.UserMapper.saveCollection", collectiona);
    }
}
