package com.xuetang9.house.domain;

import java.io.Serializable;
import javax.persistence.*;

public class Town implements Serializable {
    @Id
    @Column(name = "_id")
    private Integer id;

    private String name;

    @Column(name = "town_id")
    private String townId;

    @Column(name = "county_id")
    private String countyId;

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
     * @return town_id
     */
    public String getTownId() {
        return townId;
    }

    /**
     * @param townId
     */
    public void setTownId(String townId) {
        this.townId = townId;
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
}