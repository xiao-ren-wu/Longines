package com.longines.service;

import com.longines.pojo.TbOrder;
import com.longines.service.impl.TbOrderImpl;
import org.junit.Before;
import org.junit.Test;

public class TbOrderTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
        com.longines.pojo.TbOrder tbOrder=new TbOrder();
        new TbOrderImpl().insertSelective(tbOrder);
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectByoId() {
        new TbOrderImpl().selectByoId(2);
    }

    @Test
    public void selectgNum() {
        new TbOrderImpl().selectgNum(2);
    }
}