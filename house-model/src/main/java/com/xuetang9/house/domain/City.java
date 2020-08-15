package com.xuetang9.house.domain;

import java.io.Serializable;
import javax.persistence.*;

public class City implements Serializable {
    @Id
    @Column(name = "_id")
    private Integer id;

    private String name;

    @Column(name = "city_id")
    private String cityId;

    @Column(name = "province_id")
    private String provinceId;

    private static final long serialVersionUID = 1L;

    /**
     * @return _id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return city_id
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * @param cityId
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
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