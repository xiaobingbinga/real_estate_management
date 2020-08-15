package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@ApiModel("代理人信息实体类")
public class Agent implements Serializable {
    @Id
    @ApiModelProperty(value = "代理人唯一标识",example = "1",required = true)
    private Long id;

    @Column(name = "user_id")
    @ApiModelProperty(value = "账号标识",example = "3",required = true)
    private Long userId;

    /**
     * 代理机构编号
     */
    @Column(name = "agency_id")
    @ApiModelProperty(value = "代理机构编号",example = "1")
    private Long agencyId;

    /**
     * 电子邮件
     */
    @ApiModelProperty(value = "电子邮箱",example = "157851453@qq.com",required = true)
    private String email;

    /**
     * 从业证书编号
     */
    @ApiModelProperty(value = "从业证书编号",example = "45673215421545",required = true)
    private String certification;

    /**
     * 推荐星级
     */
    @Column(name = "commend_star")
    @ApiModelProperty(value = "推荐星级",example = "5",required = true)
    private Integer commendStar;

    /**
     * 个人网站
     */
    @Column(name = "web_site")
    @ApiModelProperty(value = "个人网站",example = "www.tdblogs.com")
    private String webSite;

    /**
     * qq空间
     */
    @Column(name = "qq_site")
    @ApiModelProperty(value = "QQ空间",example = "https://user.qzone.qq.com/157851453/infocenter")
    private String qqSite;

    /**
     * 朋友圈
     */
    @Column(name = "friend_site")
    @ApiModelProperty(value = "朋友圈",example = "没有朋友圈")
    private String friendSite;

    /**
     * 抖音
     */
    @Column(name = "douyin_site")
    @ApiModelProperty(value = "抖音",example = "没有抖音")
    private String douyinSite;

    /**
     * 个人小视频
     */
    @Column(name = "personal_video_site")
    @ApiModelProperty(value = "个人小视频",example = "没有小视频")
    private String personalVideoSite;

    /**
     * 喜马拉雅
     */
    @Column(name = "ximalaya_site")
    @ApiModelProperty(value = "喜马拉雅",example = "不听广播")
    private String ximalayaSite;

    /**
     * 支付宝
     */
    @Column(name = "zifubao_site")
    @ApiModelProperty(value = "支付宝",example = "157851453@qq.com")
    private String zifubaoSite;

    /**
     * 照片
     */
    @ApiModelProperty(value = "照片",example = "没有照片")
    private String photo;

    /**
     * 评分
     */
    @ApiModelProperty(value = "评分",example = "5")
    private Integer score;

    /**
     * 脸书
     */
    @ApiModelProperty(value = "脸书",example = "没有脸")
    private String facebook;

    /**
     * 推特
     */
    @ApiModelProperty(value = "推特",example = "没有推特")
    private String twitter;

    /**
     * ins
     */
    @ApiModelProperty(value = "INS",example = "没有INS")
    private String linkedin;

    /**
     * 谷歌
     */
    @ApiModelProperty(value = "谷歌",example = "没有谷歌账号")
    private String google;

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
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取代理机构编号
     *
     * @return agency_id - 代理机构编号
     */
    public Long getAgencyId() {
        return agencyId;
    }

    /**
     * 设置代理机构编号
     *
     * @param agencyId 代理机构编号
     */
    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    /**
     * 获取电子邮件
     *
     * @return email - 电子邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮件
     *
     * @param email 电子邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取从业证书编号
     *
     * @return certification - 从业证书编号
     */
    public String getCertification() {
        return certification;
    }

    /**
     * 设置从业证书编号
     *
     * @param certification 从业证书编号
     */
    public void setCertification(String certification) {
        this.certification = certification;
    }

    /**
     * 获取推荐星级
     *
     * @return commend_star - 推荐星级
     */
    public Integer getCommendStar() {
        return commendStar;
    }

    /**
     * 设置推荐星级
     *
     * @param commendStar 推荐星级
     */
    public void setCommendStar(Integer commendStar) {
        this.commendStar = commendStar;
    }

    /**
     * 获取个人网站
     *
     * @return web_site - 个人网站
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * 设置个人网站
     *
     * @param webSite 个人网站
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    /**
     * 获取qq空间
     *
     * @return qq_site - qq空间
     */
    public String getQqSite() {
        return qqSite;
    }

    /**
     * 设置qq空间
     *
     * @param qqSite qq空间
     */
    public void setQqSite(String qqSite) {
        this.qqSite = qqSite;
    }

    /**
     * 获取朋友圈
     *
     * @return friend_site - 朋友圈
     */
    public String getFriendSite() {
        return friendSite;
    }

    /**
     * 设置朋友圈
     *
     * @param friendSite 朋友圈
     */
    public void setFriendSite(String friendSite) {
        this.friendSite = friendSite;
    }

    /**
     * 获取抖音
     *
     * @return douyin_site - 抖音
     */
    public String getDouyinSite() {
        return douyinSite;
    }

    /**
     * 设置抖音
     *
     * @param douyinSite 抖音
     */
    public void setDouyinSite(String douyinSite) {
        this.douyinSite = douyinSite;
    }

    /**
     * 获取个人小视频
     *
     * @return personal_video_site - 个人小视频
     */
    public String getPersonalVideoSite() {
        return personalVideoSite;
    }

    /**
     * 设置个人小视频
     *
     * @param personalVideoSite 个人小视频
     */
    public void setPersonalVideoSite(String personalVideoSite) {
        this.personalVideoSite = personalVideoSite;
    }

    /**
     * 获取喜马拉雅
     *
     * @return ximalaya_site - 喜马拉雅
     */
    public String getXimalayaSite() {
        return ximalayaSite;
    }

    /**
     * 设置喜马拉雅
     *
     * @param ximalayaSite 喜马拉雅
     */
    public void setXimalayaSite(String ximalayaSite) {
        this.ximalayaSite = ximalayaSite;
    }

    /**
     * 获取支付宝
     *
     * @return zifubao_site - 支付宝
     */
    public String getZifubaoSite() {
        return zifubaoSite;
    }

    /**
     * 设置支付宝
     *
     * @param zifubaoSite 支付宝
     */
    public void setZifubaoSite(String zifubaoSite) {
        this.zifubaoSite = zifubaoSite;
    }

    /**
     * 获取照片
     *
     * @return photo - 照片
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 设置照片
     *
     * @param photo 照片
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * 获取评分
     *
     * @return score - 评分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置评分
     *
     * @param score 评分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取脸书
     *
     * @return facebook - 脸书
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * 设置脸书
     *
     * @param facebook 脸书
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * 获取推特
     *
     * @return twitter - 推特
     */
    public String getTwitter() {
        return twitter;
    }

    /**
     * 设置推特
     *
     * @param twitter 推特
     */
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * 获取ins
     *
     * @return linkedin - ins
     */
    public String getLinkedin() {
        return linkedin;
    }

    /**
     * 设置ins
     *
     * @param linkedin ins
     */
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    /**
     * 获取谷歌
     *
     * @return google - 谷歌
     */
    public String getGoogle() {
        return google;
    }

    /**
     * 设置谷歌
     *
     * @param google 谷歌
     */
    public void setGoogle(String google) {
        this.google = google;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", userId=" + userId +
                ", agencyId=" + agencyId +
                ", email='" + email + '\'' +
                ", certification='" + certification + '\'' +
                ", commendStar=" + commendStar +
                ", webSite='" + webSite + '\'' +
                ", qqSite='" + qqSite + '\'' +
                ", friendSite='" + friendSite + '\'' +
                ", douyinSite='" + douyinSite + '\'' +
                ", personalVideoSite='" + personalVideoSite + '\'' +
                ", ximalayaSite='" + ximalayaSite + '\'' +
                ", zifubaoSite='" + zifubaoSite + '\'' +
                ", photo='" + photo + '\'' +
                ", score=" + score +
                ", facebook='" + facebook + '\'' +
                ", twitter='" + twitter + '\'' +
                ", linkedin='" + linkedin + '\'' +
                ", google='" + google + '\'' +
                '}';
    }
}