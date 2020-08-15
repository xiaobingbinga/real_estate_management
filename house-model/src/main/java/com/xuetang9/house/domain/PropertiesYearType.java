package com.xuetang9.house.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "properties_year_type")
public class PropertiesYearType implements Serializable {
    @Id
    private Integer id;

    /**
     * 房产年限类型名称
     */
    @Column(name = "type_name")
    private String typeName;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
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
     * 获取房产年限类型名称
     *
     * @return type_name - 房产年限类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置房产年限类型名称
     *
     * @param typeName 房产年限类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}