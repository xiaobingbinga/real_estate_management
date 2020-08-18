package com.xuetang9.house.houselogin.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.time.LocalTime;

/**
 * @Author lyt
 * @Date 2020/8/16
 * @Copyright lyt
 * @Describe
 */
public class RegisterByPhoneTo {

    @NotBlank(message = "账号不能为空")
    private String account;
    @NotBlank(message = "手机号不能为空")
    private String mobile;
    @NotBlank(message = "密码不能为空")
    private String password;
    @NotBlank(message = "确认密码不能为空")
    private String confirmPassword;
    @NotBlank(message = "验证码不能为空")
    private String authCode;
    @NotBlank(message = "姓名不能为空")
    private String name;
    @NotBlank(message = "昵称不能为空")
    private String nickName;
    @NotNull(message = "角色不能为空")
    private Integer utId;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getUtId() {
        return utId;
    }

    public void setUtId(Integer utId) {
        this.utId = utId;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "RegisterByPhoneTo{" +
                "account='" + account + '\'' +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", authCode='" + authCode + '\'' +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", utId=" + utId +
                '}';
    }
}
