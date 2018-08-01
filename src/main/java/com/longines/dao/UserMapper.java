package com.longines.dao;


import com.longines.pojo.CollectionA;
import com.longines.pojo.CollectionB;
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
    public CollectionB findCollection(Integer id);
    public void   saveCollection(CollectionA collectiona);

}
