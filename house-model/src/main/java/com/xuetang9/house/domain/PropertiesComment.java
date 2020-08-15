package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@ApiModel("房产详情回复实体类")
@Table(name = "properties_comment")
public class PropertiesComment implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @ApiModelProperty(value = "回复消息唯一标识",example = "1",required = true)
    private Integer id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    @ApiModelProperty(value = "用户唯一标识",example = "1",required = true)
    private Long userId;

    /**
     * 房产ID
     */
    @Column(name = "pro_id")
    @ApiModelProperty(value = "房产信息唯一标识",example = "1",required = true)
    private Integer proId;

    /**
     * 评论内容
     */
    @ApiModelProperty(value = "回复内容",example = "这房子我买过，垃圾的一批",required = true)
    private String content;

    /**
     * 回复信息的ID
     */
    @ApiModelProperty(value = "是否非主回复",example = "0",required = true)
    @Column(name = "parent_id")
    private Integer parentId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取房产ID
     *
     * @return pro_id - 房产ID
     */
    public Integer getProId() {
        return proId;
    }

    /**
     * 设置房产ID
     *
     * @param proId 房产ID
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取回复信息的ID
     *
     * @return parent_id - 回复信息的ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置回复信息的ID
     *
     * @param parentId 回复信息的ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "PropertiesComment{" +
                "id=" + id +
                ", userId=" + userId +
                ", proId=" + proId +
                ", content='" + content + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}