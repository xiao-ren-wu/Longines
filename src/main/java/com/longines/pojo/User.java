package com.longines.pojo;


import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @author leijing
 *
 */
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class User  {
    private int u_id;     //用户ID
    private String uname;    //用户名
    private String tel_num;  //手机号码
    private String pw;       //密码
    private double ac_balance;//账户余额
    private String pic;      //头像
    public int getUser_id() {
        return u_id;
    }
    public void setUser_id(int user_id) {
        this.u_id = user_id;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
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
    public double getAc_balance() {
        return ac_balance;
    }
    public void setAc_balance(double ac_balance) {
        this.ac_balance = ac_balance;
    }
    public String getPic() {
        return pic;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    @Override
    public String toString() {
        return "user [user_id=" + u_id + ", uname=" + uname + ",tel_num=" + tel_num + ", pw=" + pw
                + ", ac_balance=" + ac_balance + ",  pic=" + pic + "]";
    }
}
