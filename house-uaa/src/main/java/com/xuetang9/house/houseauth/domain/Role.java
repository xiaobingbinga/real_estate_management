package com.xuetang9.house.houseauth.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * @ClassName Role
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/20 10:37
 * @Version V1.0
 */
public class Role implements GrantedAuthority {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
