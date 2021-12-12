package YF.pojo;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
@Repository
public class User {
    private String id;//编号
    private String username;//账户名
    private String password;//密码
    private String name;//姓名
    private int age;//年龄
    private String address;//住址
    private String signature;//个人简介
    private byte[] portrait;//头像
    private String phone;//电话
    private String qq;//qq
    private String wechat;//微信
    private String eMail;//邮箱

    public User() {
    }
    public User(String id, String username, String password, String name, int age, String address, String signature, byte[] portrait, String phone, String qq, String wechat, String eMail) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.address = address;
        this.signature = signature;
        this.portrait = portrait;
        this.phone = phone;
        this.qq = qq;
        this.wechat = wechat;
        this.eMail = eMail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public byte[] getPortrait() {
        return portrait;
    }

    public void setPortrait(byte[] portrait) {
        this.portrait = portrait;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", signature='" + signature + '\'' +
                ", portrait=" + Arrays.toString(portrait) +
                ", phone='" + phone + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }

}
