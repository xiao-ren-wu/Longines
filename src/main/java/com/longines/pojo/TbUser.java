package com.longines.pojo;

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
}