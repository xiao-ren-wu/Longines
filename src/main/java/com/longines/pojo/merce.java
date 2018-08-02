package com.longines.pojo;

import java.util.Date;

public class merce {

	private int m_id;          //商家ID
	private String sname;      //店铺名称
	private String s_cred;     //店铺信誉
	private Date s_time;     //开店时间
	private String home;       //所在地
	private String c_into;     //店铺简介
	private String m_tel;      //电话
	private String s_manager;  //店长
	private String b_card;     //店铺名片
	private String p_ser;   //平台服务费
	
	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getS_cred() {
		return s_cred;
	}

	public void setS_cred(String s_cred) {
		this.s_cred = s_cred;
	}

	public Date getS_time() {
		return s_time;
	}

	public void setS_time(Date s_time) {
		this.s_time = s_time;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getC_into() {
		return c_into;
	}

	public void setC_into(String c_into) {
		this.c_into = c_into;
	}

	public String getM_tel() {
		return m_tel;
	}

	public void setM_tel(String m_tel) {
		this.m_tel = m_tel;
	}

	public String getS_manager() {
		return s_manager;
	}

	public void setS_manager(String s_manager) {
		this.s_manager = s_manager;
	}

	public String getB_card() {
		return b_card;
	}

	public void setB_card(String b_card) {
		this.b_card = b_card;
	}

	public String getPlat_ser() {
		return p_ser;
	}

	public void setPlat_ser(String plat_ser) {
		this.p_ser = plat_ser;
	}

	@Override
	public String toString() {
		return "merce [m_id=" + m_id + ", sname=" + sname + ", s_cred=" + s_cred + ", s_time=" + s_time + ", home="
				+ home + ", c_into=" + c_into + ", m_tel=" + m_tel + ", s_manager=" + s_manager + ", b_card=" + b_card
				+ ", plat_ser=" + p_ser + "]";
	}

	
}
