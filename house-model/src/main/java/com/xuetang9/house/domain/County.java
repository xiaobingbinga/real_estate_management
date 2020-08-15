package com.xuetang9.house.domain;

import java.io.Serializable;
import javax.persistence.*;

public class County implements Serializable {
    @Id
    @Column(name = "_id")
    private Integer id;

    private String name;

    @Column(name = "county_id")
    private String countyId;

    @Column(name = "city_id")
    private String cityId;

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
     * @return county_id
     */
    public String getCountyId() {
        return countyId;
    }

    /**
     * @param countyId
     */
    public void setCountyId(String countyId) {
        this.countyId = countyId;
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
}