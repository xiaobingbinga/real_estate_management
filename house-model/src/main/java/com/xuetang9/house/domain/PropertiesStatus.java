package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@ApiModel("房产状态实体类")
@Table(name = "properties_status")
public class PropertiesStatus implements Serializable {
    @Id
    @ApiModelProperty(value = "房产状态唯一标识",example = "1",required = true)
    private Integer id;

    @Column(name = "status_name")
    @ApiModelProperty(value = "房产状态名称",example = "未出租",required = true)
    private String statusName;

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
     * @return status_name
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * @param statusName
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Override
    public String toString() {
        return "PropertiesStatus{" +
                "id=" + id +
                ", statusName='" + statusName + '\'' +
                '}';
    }
}