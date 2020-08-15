package com.xuetang9.house.domain;

import java.io.Serializable;
import javax.persistence.*;

public class Permission implements Serializable {
    /**
     * 编号
     */
    @Id
    private Long id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 展示名称
     */
    private String displayname;

    /**
     * 权限类型
     */
    private Integer type;

    /**
     * 权限数据
     */
    private String data;

    /**
     * 描述
     */
    private String comment;

    private static final long serialVersionUID = 1L;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取展示名称
     *
     * @return displayname - 展示名称
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * 设置展示名称
     *
     * @param displayname 展示名称
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    /**
     * 获取权限类型
     *
     * @return type - 权限类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置权限类型
     *
     * @param type 权限类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取权限数据
     *
     * @return data - 权限数据
     */
    public String getData() {
        return data;
    }

    /**
     * 设置权限数据
     *
     * @param data 权限数据
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * 获取描述
     *
     * @return comment - 描述
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置描述
     *
     * @param comment 描述
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}