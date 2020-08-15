package com.xuetang9.house.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "role_to_permission")
public class RoleToPermission implements Serializable {
    private Long roleid;

    private Long permissionid;

    private static final long serialVersionUID = 1L;

    /**
     * @return roleid
     */
    public Long getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    /**
     * @return permissionid
     */
    public Long getPermissionid() {
        return permissionid;
    }

    /**
     * @param permissionid
     */
    public void setPermissionid(Long permissionid) {
        this.permissionid = permissionid;
    }
}