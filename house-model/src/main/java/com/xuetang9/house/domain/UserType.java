package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@ApiModel("用户类型实体类")
@Table(name = "user_type")
public class UserType implements Serializable {
    /**
     * 用户类型编号
     */
    @Id
    @Column(name = "ut_id")
    @ApiModelProperty(value = "用户类型唯一标识",example = "1",required = true)
    private Integer utId;

    /**
     * 用户类型名称
     */
    @Column(name = "ut_name")
    @ApiModelProperty(value = "用户类型名称",example = "普通用户",required = true)
    private String utName;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户类型编号
     *
     * @return ut_id - 用户类型编号
     */
    public Integer getUtId() {
        return utId;
    }

    /**
     * 设置用户类型编号
     *
     * @param utId 用户类型编号
     */
    public void setUtId(Integer utId) {
        this.utId = utId;
    }

    /**
     * 获取用户类型名称
     *
     * @return ut_name - 用户类型名称
     */
    public String getUtName() {
        return utName;
    }

    /**
     * 设置用户类型名称
     *
     * @param utName 用户类型名称
     */
    public void setUtName(String utName) {
        this.utName = utName;
    }
}