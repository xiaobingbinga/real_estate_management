package com.xuetang9.house.domain;

import java.io.Serializable;
import javax.persistence.*;

public class Role implements Serializable {
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
     * 角色展示名
     */
    private String displayname;

    /**
     * 角色描述
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
     * 获取角色展示名
     *
     * @return displayname - 角色展示名
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * 设置角色展示名
     *
     * @param displayname 角色展示名
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    /**
     * 获取角色描述
     *
     * @return comment - 角色描述
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置角色描述
     *
     * @param comment 角色描述
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}