package com.xuetang9.house.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "user_to_role")
public class UserToRole implements Serializable {
    /**
     * 用户编号
     */
    private Long userid;

    /**
     * 角色编号
     */
    private Long roleid;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户编号
     *
     * @return userid - 用户编号
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * 设置用户编号
     *
     * @param userid 用户编号
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * 获取角色编号
     *
     * @return roleid - 角色编号
     */
    public Long getRoleid() {
        return roleid;
    }

    /**
     * 设置角色编号
     *
     * @param roleid 角色编号
     */
    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }
}