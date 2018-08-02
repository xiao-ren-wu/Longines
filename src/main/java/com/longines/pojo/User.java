package com.longines.pojo;


import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @author XiaoRenwu
 * e-mail 18629015421@163.com
 * github https://github.com/xiao-ren-wu
 * @version 1
 * @since 2018/7/8 23:53
 */
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class User {
    private int u_id;     //用户ID
    private String uname;    //用户名
    private String sex;      //性别
    private String tel_num;  //手机号码
    private String pw;       //密码
    private double ac_balance;//账户余额
    private String label;    //个性标签
    private String birth;    //生日
    private String pic;      //头像
    private String sug;      //意见反馈
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
    public double getAc_balance() {
        return ac_balance;
    }
    public void setAc_balance(double ac_balance) {
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
        return "User [user_id=" + u_id + ", uname=" + uname + ", sex=" + sex + ", tel_num=" + tel_num + ", pw=" + pw
                + ", ac_balance=" + ac_balance + ", label=" + label + ", birth=" + birth + ", pic=" + pic + ", sug="
                + sug + "]";
    }

}
