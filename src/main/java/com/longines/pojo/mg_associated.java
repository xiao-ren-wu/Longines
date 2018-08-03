package com.longines.pojo;

import java.util.Date;

public class mg_associated {
	/**
	 *  商家ID
	 */
	private int mId;
	/**
	 *  商品ID
	 */
	private int gId;
	/**
	 *  库存量
	 */
	private int inv;
	/**
	 *  上架时间
	 */
	private Date sTime;

	public Date getsTime() {
		return sTime;
	}

	public void setsTime(Date sTime) {
		this.sTime = sTime;
	}

	public int getmId() {

		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public int getInv() {

		return inv;
	}

	public void setInv(int inv) {
		this.inv = inv;
	}

	public int getgId() {

		return gId;
	}

	public void setgId(int gId) {
		this.gId = gId;
	}

	@Override
	public String toString() {
		return "mg_associated [mId=" + mId + ", goodsId=" + gId + ", inv=" + inv + ", shelf_time=" + sTime + "]";
	}
	

}
