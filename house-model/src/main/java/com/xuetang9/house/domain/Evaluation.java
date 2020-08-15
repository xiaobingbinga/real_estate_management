package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@ApiModel("新闻回复实体类")
public class Evaluation implements Serializable {
    @Id
    private Long id;

    /**
     * 新闻标识
     */
    @Column(name = "news_id")
    private Long newsId;

    /**
     * 账号标识
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 回复时间
     */
    @Column(name = "response_time")
    private Date responseTime;

    /**
     * 回复内容
     */
    @Column(name = "reply_content")
    private String replyContent;

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
     * 获取新闻标识
     *
     * @return news_id - 新闻标识
     */
    public Long getNewsId() {
        return newsId;
    }

    /**
     * 设置新闻标识
     *
     * @param newsId 新闻标识
     */
    public void setNewsId(Long newsId) {
        this.newsId = newsId;
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
     * 获取回复时间
     *
     * @return response_time - 回复时间
     */
    public Date getResponseTime() {
        return responseTime;
    }

    /**
     * 设置回复时间
     *
     * @param responseTime 回复时间
     */
    public void setResponseTime(Date responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * 获取回复内容
     *
     * @return reply_content - 回复内容
     */
    public String getReplyContent() {
        return replyContent;
    }

    /**
     * 设置回复内容
     *
     * @param replyContent 回复内容
     */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", newsId=" + newsId +
                ", userId=" + userId +
                ", responseTime=" + responseTime +
                ", replyContent='" + replyContent + '\'' +
                '}';
    }
}