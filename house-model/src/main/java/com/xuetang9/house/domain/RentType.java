package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@ApiModel("租售类型实体类")
@Table(name = "rent_type")
public class RentType implements Serializable {
    @Id
    @ApiModelProperty(value = "租售类型唯一标识",example = "1",required = true)
    private Integer id;

    /**
     * 房屋租售类型名称
     */
    @Column(name = "type_name")
    @ApiModelProperty(value = "租售类型名称",example = "出租",required = true)
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
     * 获取房屋租售类型名称
     *
     * @return type_name - 房屋租售类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置房屋租售类型名称
     *
     * @param typeName 房屋租售类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "RentType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}