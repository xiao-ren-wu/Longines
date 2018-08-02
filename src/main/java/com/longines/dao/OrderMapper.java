package com.longines.dao;


import com.longines.pojo.Order;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author XiaoRenwu
 * e-mail 18629015421@163.com
 * github https://github.com/xiao-ren-wu
 * @version 1
 * @since 2018/7/8 23:54
 */
@Component
public interface OrderMapper {
    public Order findOrderById(int o_id) throws Exception;
}
