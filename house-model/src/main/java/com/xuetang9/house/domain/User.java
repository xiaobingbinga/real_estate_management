package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@ApiModel("用户账号信息实体类")
public class User implements Serializable {
    @Id
    @ApiModelProperty(value = "用户唯一标识",example = "1",required = true)
    private Long id;

    /**
     * 账号
     */
    @ApiModelProperty(value = "账号",example = "admin",required = true)
    private String account;

    /**
     * 电话（有唯一性约束）
     */
    @ApiModelProperty(value = "手机号",example = "1999999124",required = true)
    private String mobile;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码",example = "12345",required = true)
    private String password;

    /**
     * 真实姓名
     */
    @ApiModelProperty(value = "真实姓名",example = "赵云",required = true)
    private String name;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "用户昵称",example = "没有昵称",required = true)
    private String nikename;

    /**
     * 用户简介
     */
    @ApiModelProperty(value = "用户简介",example = "这个人很懒，啥都没有留下")
    private String brief;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址",example = "四川省成都市双流区电子科技工业园")
    private String address;

    /**
     * 坐机
     */
    @ApiModelProperty(value = "座机",example = "没得座机")
    private String phone;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像",example = "这个地方是图片地址")
    private String head;

    /**
     * 注册时间
     */
    @Column(name = "reg_time")
    @ApiModelProperty(value = "注册时间",example = "2020-08-03",required = true)
    private Date regTime;

    /**
     * 状态ID
     */
    @Column(name = "status_id")
    @ApiModelProperty(value = "用户状态")
    private Integer statusId;

    /**
     * 用户类型ID
     */
    @Column(name = "ut_id")
    @ApiModelProperty(value = "用户类型")
    private Integer utId;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取电话（有唯一性约束）
     *
     * @return mobile - 电话（有唯一性约束）
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置电话（有唯一性约束）
     *
     * @param mobile 电话（有唯一性约束）
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取真实姓名
     *
     * @return name - 真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置真实姓名
     *
     * @param name 真实姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取昵称
     *
     * @return nikename - 昵称
     */
    public String getNikename() {
        return nikename;
    }

    /**
     * 设置昵称
     *
     * @param nikename 昵称
     */
    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    /**
     * 获取用户简介
     *
     * @return brief - 用户简介
     */
    public String getBrief() {
        return brief;
    }

    /**
     * 设置用户简介
     *
     * @param brief 用户简介
     */
    public void setBrief(String brief) {
        this.brief = brief;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取坐机
     *
     * @return phone - 坐机
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置坐机
     *
     * @param phone 坐机
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取头像
     *
     * @return head - 头像
     */
    public String getHead() {
        return head;
    }

    /**
     * 设置头像
     *
     * @param head 头像
     */
    public void setHead(String head) {
        this.head = head;
    }

    /**
     * 获取注册时间
     *
     * @return reg_time - 注册时间
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * 设置注册时间
     *
     * @param regTime 注册时间
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * 获取状态ID
     *
     * @return status_id - 状态ID
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * 设置状态ID
     *
     * @param statusId 状态ID
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * 获取用户类型ID
     *
     * @return ut_id - 用户类型ID
     */
    public Integer getUtId() {
        return utId;
    }

    /**
     * 设置用户类型ID
     *
     * @param utId 用户类型ID
     */
    public void setUtId(Integer utId) {
        this.utId = utId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", nikename='" + nikename + '\'' +
                ", brief='" + brief + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", head='" + head + '\'' +
                ", regTime=" + regTime +
                ", statusId=" + statusId +
                ", utId=" + utId +
                '}';
    }
}