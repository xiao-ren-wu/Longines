package com.longines.dao;


import com.longines.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author XiaoRenwu
 * e-mail 18629015421@163.com
 * github https://github.com/xiao-ren-wu
 * @version 1
 * @since 2018/7/8 23:54
 */
@Component
public interface UserMapper {
    public User find(Integer id);
}
