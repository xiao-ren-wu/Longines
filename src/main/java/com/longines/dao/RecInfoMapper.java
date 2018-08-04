package com.longines.dao;

import com.longines.pojo.RecInfo;

import java.util.List;


public interface RecInfoMapper {
    void insert(RecInfo todo);

    List<RecInfo> getTodoList();

    RecInfo getTodo(int u_id);

    int updateConsignee(RecInfo todo);

    int updateSadd(RecInfo todo);

    int updateCtel(RecInfo todo);

    int updatePostcode(RecInfo todo);

    int delete(int u_id);

}
