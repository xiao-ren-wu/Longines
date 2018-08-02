package com.longines.pojo;

import java.util.Date;

public class mg_associated {

	private int m_id;            //商家ID
	private int g_id;        //商品ID
	private int inv;             //库存量
	private Date s_time;     //上架时间
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public int getGoods_id() {
		return g_id;
	}
	public void setGoods_id(int goods_id) {
		this.g_id = goods_id;
	}
	public int getInv() {
		return inv;
	}
	public void setInv(int inv) {
		this.inv = inv;
	}
	public Date getShelf_time() {
		return s_time;
	}
	public void setShelf_time(Date shelf_time) {
		this.s_time = shelf_time;
	}
	@Override
	public String toString() {
		return "mg_associated [m_id=" + m_id + ", goods_id=" + g_id + ", inv=" + inv + ", shelf_time=" + s_time
				+ "]";
	}
	

}
