package com.longines.dao;

import com.longines.pojo.Order_info;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public interface CreateOrder {
     public void save(Order_info order_info)throws  Exception;

}
