package com.longines.pojo;

import java.util.Date;

public class merce {

	/**
	 商家ID
	 */
	private int mId;
	/**
	 店铺名称
	 */
	private String sName;
	/**
	 店铺信誉
	 */
	private String sCred;
	/**
	 开店时间
	 */
	private Date sTime;
	/**
	 所在地
	 */
	private String home;
	/**
	 店铺简介
	 */
	private String cInto;
	/**
	 电话
	 */
	private String mTel;
	/**
	 店长
	 */
	private String sManager;
	/**
	 店铺名片
	 */
	private String bCard;
	/**
	 平台服务费
	 */
	private String pSer;

	public Date getsTime() {
		return sTime;
	}

	public void setsTime(Date sTime) {
		this.sTime = sTime;
	}

	public String getsName() {

		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsManager() {

		return sManager;
	}

	public void setsManager(String sManager) {
		this.sManager = sManager;
	}

	public String getsCred() {

		return sCred;
	}

	public void setsCred(String sCred) {
		this.sCred = sCred;
	}

	public String getpSer() {

		return pSer;
	}

	public void setpSer(String pSer) {
		this.pSer = pSer;
	}

	public int getmId() {

		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmTel() {

		return mTel;
	}

	public void setmTel(String mTel) {
		this.mTel = mTel;
	}

	public String getHome() {

		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getcInto() {

		return cInto;
	}

	public void setcInto(String cInto) {
		this.cInto = cInto;
	}

	public String getbCard() {

		return bCard;
	}

	public void setbCard(String bCard) {
		this.bCard = bCard;
	}

	@Override
	public String toString() {
		return "merce [mId=" + mId + ", sName=" + sName + ", sCred=" + sCred + ", sTime=" + sTime + ", home="
				+ home + ", cInto=" + cInto + ", mTel=" + mTel + ", sManager=" + sManager + ", bCard=" + bCard
				+ ", pSer=" + pSer + "]";
	}

	
}
