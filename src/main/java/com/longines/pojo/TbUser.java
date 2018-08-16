package com.longines.pojo;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
/**
*@author zhaoxiaokang
*@since 2018/8/8 22:07
*@version 1.0
*/
public class TbUser {
    private Integer uId;

    private String uname;

    private String sex;

    private String telNum;

    private String pw;

    private Long acBalance;

    private String label;

    private String birth;

    private String pic;

    private String sug;

    private Date createtime;

    private Date updatetime;

    private String valQu;

    private String antoqu;

    private String payCod;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum == null ? null : telNum.trim();
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw == null ? null : pw.trim();
    }

    public Long getAcBalance() {
        return acBalance;
    }

    public void setAcBalance(Long acBalance) {
        this.acBalance = acBalance;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getSug() {
        return sug;
    }

    public void setSug(String sug) {
        this.sug = sug == null ? null : sug.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getValQu() {
        return valQu;
    }

    public void setValQu(String valQu) {
        this.valQu = valQu == null ? null : valQu.trim();
    }

    public String getAntoqu() {
        return antoqu;
    }

    public void setAntoqu(String antoqu) {
        this.antoqu = antoqu == null ? null : antoqu.trim();
    }

    public String getPayCod() {
        return payCod;
    }

    public void setPayCod(String payCod) {
        this.payCod = payCod;
    }

    private MultipartFile image;
    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

}