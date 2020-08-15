package com.xuetang9.house.domain;

import java.io.Serializable;
import javax.persistence.*;

public class Province implements Serializable {
    /**
     * 城市编号
     */
    @Id
    private Integer id;

    /**
     * 城市名称
     */
    private String name;

    @Column(name = "province_id")
    private String provinceId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取城市编号
     *
     * @return id - 城市编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置城市编号
     *
     * @param id 城市编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取城市名称
     *
     * @return name - 城市名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置城市名称
     *
     * @param name 城市名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return province_id
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * @param provinceId
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }
}