package com.xuetang9.house.houselogin.dto;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @Author lyt
 * @Date 2020/8/17
 * @Copyright lyt
 * @Describe
 */
public class RegisterByAccountTo {

    @NotBlank(message = "账号不能为空")
    private String account;
    @NotBlank(message = "姓名不能为空")
    private String name;
    @NotBlank(message = "昵称不能为空")
    private String nickName;
    @NotBlank(message = "密码不能为空")
    private String password;
    @NotBlank(message = "确认密码不能为空")
    private String confirmPassword;
    @NotBlank(message = "角色不能为空")
    private Integer utId;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Integer getUtId() {
        return utId;
    }

    public void setUtId(Integer utId) {
        this.utId = utId;
    }

    @Override
    public String toString() {
        return "RegisterByAccountTo{" +
                "account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", utId=" + utId +
                '}';
    }
}
