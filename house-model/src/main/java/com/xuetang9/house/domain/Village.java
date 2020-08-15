package com.xuetang9.house.domain;

import java.io.Serializable;
import javax.persistence.*;

public class Village implements Serializable {
    @Id
    @Column(name = "_id")
    private Integer id;

    private String name;

    @Column(name = "village_id")
    private String villageId;

    @Column(name = "town_id")
    private String townId;

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
     * @return village_id
     */
    public String getVillageId() {
        return villageId;
    }

    /**
     * @param villageId
     */
    public void setVillageId(String villageId) {
        this.villageId = villageId;
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
}