package com.longines.dao;

import com.longines.pojo.User;

/**
 * @author leijing
 * */
public interface UserMapper {
    public User findUserById(int id) throws Exception;
}
