package com.longines.pojo;


public class goods_info {
	/**
	商品ID
 	*/
	private int gId;
	/**
	 商品名
	 */
	private String gName;
	/**
	 品牌
	 */
	private String brand;
	/**
	 价格
	 */
	private double price;
	/**
	 主题
	 */
	private String theme;
	/**
	 机芯
	 */
	private String mov;
	/**
	 功能
	 */
	private String func;
	/**
	 //适用人群
	 */
	private String apeo;
	/**
	 表盘
	 */
	private String dial;
	/**
	 表带
	 */
	private String strap;
	/**
	 表扣
	 */
	private String wbut;
	/**
	 商品图片
	 */
	private String gpic;

	public String getWbut() {
		return wbut;
	}

	public void setWbut(String wbut) {
		this.wbut = wbut;
	}

	public String getTheme() {

		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getStrap() {

		return strap;
	}

	public void setStrap(String strap) {
		this.strap = strap;
	}

	public double getPrice() {

		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMov() {

		return mov;
	}

	public void setMov(String mov) {
		this.mov = mov;
	}

	public String getGpic() {

		return gpic;
	}

	public void setGpic(String gpic) {
		this.gpic = gpic;
	}

	public String getgName() {

		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public int getgId() {

		return gId;
	}

	public void setgId(int gId) {
		this.gId = gId;
	}

	public String getFunc() {

		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	public String getDial() {

		return dial;
	}

	public void setDial(String dial) {
		this.dial = dial;
	}

	public String getBrand() {

		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getApeo() {

		return apeo;
	}

	public void setApeo(String apeo) {
		this.apeo = apeo;
	}

	/**
	 商品名
	 */

	@Override
	public String toString() {
		return "goods_info [goodsId=" + gId + ", gName=" + gName + ", brand=" + brand + ", price=" + price
				+ ", theme=" + theme + ", mov=" + mov + ", func=" + func + ", a_peo=" + apeo + ", dial=" + dial
				+ ", strap=" + strap + ", w_but=" + wbut + ", g_pic=" + gpic + "]";
	}
	

}
