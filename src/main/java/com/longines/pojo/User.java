package com.longines.pojo;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.math.BigDecimal;

/**
 * @author XiaoRenwu
 * e-mail 18629015421@163.com
 * github https://github.com/xiao-ren-wu
 * @version 1
 * @since 2018/7/8 23:53
 */
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class User  {
    private  Integer user_id;
    private  String  uname;
    private  String  sex;
    private  String  tel_num;
    private  String  pw;
    private  BigDecimal ac_balance;
    private  String label;
    private  String birth;
    private  String pic;
    private  String sug;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel_num() {
        return tel_num;
    }

    public void setTel_num(String tel_num) {
        this.tel_num = tel_num;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public BigDecimal getAc_balance() {
        return ac_balance;
    }

    public void setAc_balance(BigDecimal ac_balance) {
        this.ac_balance = ac_balance;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getSug() {
        return sug;
    }

    public void setSug(String sug) {
        this.sug = sug;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", uname='" + uname + '\'' +
                ", sex='" + sex + '\'' +
                ", tel_num='" + tel_num + '\'' +
                ", pw='" + pw + '\'' +
                ", ac_balance=" + ac_balance +
                ", label='" + label + '\'' +
                ", birth='" + birth + '\'' +
                ", pic='" + pic + '\'' +
                ", sug='" + sug + '\'' +
                '}';
    }
}

