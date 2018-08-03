package com.longines.service;

import com.longines.pojo.RecInfo;

import java.util.List;

public interface RecInfoService {
    void insert(RecInfo todo);

    List<RecInfo> getTodoList();

    RecInfo getTodo(int u_id);

    int update(RecInfo todo);

    int delete(int u_id);
}
