package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@ApiModel("代理商信息实体类")
public class Agency implements Serializable {
    @Id
    @ApiModelProperty(value = "代理商唯一标识",example = "1",required = true)
    private Long id;

    /**
     * 所属用户
     */
    @Column(name = "user_id")
    @ApiModelProperty(value = "账号标识",example = "2",required = true)
    private Long userId;

    /**
     * 企业邮箱
     */
    @ApiModelProperty(value = "企业邮箱",example = "laojiuxuetang@163.com",required = true)
    private String email;

    /**
     * 营业执照代码
     */
    @ApiModelProperty(value = "营业执照代码",example = "154321567423874564",required = true)
    private String license;

    /**
     * 企业网站
     */
    @ApiModelProperty(value = "企业网站",example = "www.laojiuxuetang.com",required = true)
    private String website;

    /**
     * 机构图标
     */
    @ApiModelProperty(value = "机构图标",example = "暂时没有",required = true)
    private String icon;

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
     * 获取所属用户
     *
     * @return user_id - 所属用户
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置所属用户
     *
     * @param userId 所属用户
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取企业邮箱
     *
     * @return email - 企业邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置企业邮箱
     *
     * @param email 企业邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取营业执照代码
     *
     * @return license - 营业执照代码
     */
    public String getLicense() {
        return license;
    }

    /**
     * 设置营业执照代码
     *
     * @param license 营业执照代码
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * 获取企业网站
     *
     * @return website - 企业网站
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置企业网站
     *
     * @param website 企业网站
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * 获取机构图标
     *
     * @return icon - 机构图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置机构图标
     *
     * @param icon 机构图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "id=" + id +
                ", userId=" + userId +
                ", email='" + email + '\'' +
                ", license='" + license + '\'' +
                ", website='" + website + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}