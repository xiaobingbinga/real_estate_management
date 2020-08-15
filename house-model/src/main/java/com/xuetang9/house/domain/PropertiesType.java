package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@ApiModel("房产类型实体类")
@Table(name = "properties_type")
public class PropertiesType implements Serializable {
    @Id
    @ApiModelProperty(value = "房产类型唯一标识",example = "1",required = true)
    private Integer id;

    /**
     * 房产类型名称
     */
    @Column(name = "type_name")
    @ApiModelProperty(value = "房产类型名称",example = "公寓",required = true)
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
     * 获取房产类型名称
     *
     * @return type_name - 房产类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置房产类型名称
     *
     * @param typeName 房产类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "PropertiesType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}