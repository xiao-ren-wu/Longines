package com.longines.dao;

import com.longines.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class FindUserIdImpl extends SqlSessionDaoSupport implements FindUserId {
    @Override
    public User findUserById(int id) throws Exception{
        return this.getSqlSession().selectOne("com.longines.dao.FindUserId.findUserId",id);
    }
}
