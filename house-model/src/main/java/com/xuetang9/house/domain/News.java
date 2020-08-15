package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@ApiModel("新闻信息实体类")
public class News implements Serializable {
    @Id
    @ApiModelProperty(value = "新闻唯一标识",example = "1",required = true)
    private Long id;

    /**
     * 账号标识
     */
    @Column(name = "user_id")
    @ApiModelProperty(value = "账号标识",example = "5",required = true)
    private Long userId;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题",example = "震惊！某公寓竟发生这种事！",required = true)
    private String title;

    /**
     * 发表时间
     */
    @Column(name = "issuing_time")
    @ApiModelProperty(value = "发表时间",example = "2020-08-04",required = true)
    private Date issuingTime;

    /**
     * 标签
     */
    @ApiModelProperty(value = "标签",example = "爆料",required = true)
    private String label;

    /**
     * 图片地址
     */
    @Column(name = "image_url")
    @ApiModelProperty(value = "图片地址",example = "暂时没有")
    private String imageUrl;

    /**
     * 文章内容
     */
    @ApiModelProperty(value = "文章内容",example = "据了解，某公寓物业从不处理垃圾，导致垃圾都被垃圾回收站拉走了。",required = true)
    private String content;

    /**
     * 文章简介
     */
    @ApiModelProperty(value = "文章内容",example = "公寓物业竟然做出这种事！真是令人发指！",required = true)
    private String summary;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取账号标识
     *
     * @return user_id - 账号标识
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置账号标识
     *
     * @param userId 账号标识
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取发表时间
     *
     * @return issuing_time - 发表时间
     */
    public Date getIssuingTime() {
        return issuingTime;
    }

    /**
     * 设置发表时间
     *
     * @param issuingTime 发表时间
     */
    public void setIssuingTime(Date issuingTime) {
        this.issuingTime = issuingTime;
    }

    /**
     * 获取标签
     *
     * @return label - 标签
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签
     *
     * @param label 标签
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取图片地址
     *
     * @return image_url - 图片地址
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置图片地址
     *
     * @param imageUrl 图片地址
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 获取文章内容
     *
     * @return content - 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置文章内容
     *
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取文章简介
     *
     * @return summary - 文章简介
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置文章简介
     *
     * @param summary 文章简介
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", issuingTime=" + issuingTime +
                ", label='" + label + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", content='" + content + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}