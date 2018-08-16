package com.longines.vo;



/**
 * @author    liuchanghui
 *
 * @since     2018/8/10/010 9:16
 * @version   1.0
 */
public class TbCollectionVo {
    private Integer uId;

    private Integer gId;

    private Integer cPrice;

    private Integer pur;

    private Integer invalid;

    private  String gPic;

    private long gPrice;

    private  String  gName;

    public long getgPrice() {
        return gPrice;
    }

    public void setgPrice(long gPrice) {
        this.gPrice = gPrice;
    }


    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getPur() {
        return pur;
    }

    public void setPur(Integer pur) {
        this.pur = pur;
    }

    public Integer getInvalid() {
        return invalid;
    }

    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }

    public Integer getcPrice() {
        return cPrice;
    }

    public void setcPrice(Integer cPrice) {
        this.cPrice = cPrice;
    }

    public String getgPic1() {
        return gPic;
    }

    public void setgPic(String gPic) {
        this.gPic = gPic;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }
}
