package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@ApiModel("用户状态实体类")
@Table(name = "user_status")
public class UserStatus implements Serializable {
    /**
     * 用户状态编号
     */
    @Id
    @Column(name = "status_id")
    @ApiModelProperty(value = "用户状态唯一标识",example = "1",required = true)
    private Integer statusId;

    /**
     * 状态名称
     */
    @Column(name = "status_name")
    @ApiModelProperty(value = "用户状态名称",example = "正常",required = true)
    private String statusName;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户状态编号
     *
     * @return status_id - 用户状态编号
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * 设置用户状态编号
     *
     * @param statusId 用户状态编号
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * 获取状态名称
     *
     * @return status_name - 状态名称
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * 设置状态名称
     *
     * @param statusName 状态名称
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}