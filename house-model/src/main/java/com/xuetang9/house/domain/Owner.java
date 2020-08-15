package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@ApiModel("出租/出售人员信息实体类")
public class Owner implements Serializable {
    /**
     * 唯一标识
     */
    @Id
    @ApiModelProperty(value = "用户唯一标识",example = "1",required = true)
    private Long id;

    /**
     * 关联代理人
     */
    @Column(name = "agent_id")
    @ApiModelProperty(value = "关联代理人",example = "1")
    private Long agentId;

    /**
     * 所属用户
     */
    @Column(name = "user_id")
    @ApiModelProperty(value = "账号标识",example = "4",required = true)
    private Long userId;

    /**
     * 电子邮箱
     */
    @ApiModelProperty(value = "电子邮箱",example = "157851453@qq.com")
    private String email;

    /**
     * 所属公司
     */
    @ApiModelProperty(value = "所属公司",example = "老九学堂")
    private String company;

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
    @ApiModelProperty(value = "个人小视频",example = "没有视频")
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

    private static final long serialVersionUID = 1L;

    /**
     * 获取唯一标识
     *
     * @return id - 唯一标识
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置唯一标识
     *
     * @param id 唯一标识
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取关联代理人
     *
     * @return agent_id - 关联代理人
     */
    public Long getAgentId() {
        return agentId;
    }

    /**
     * 设置关联代理人
     *
     * @param agentId 关联代理人
     */
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    /**
     * 获取所属用户
     *
     * @return user_id - 所属用户
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置所属用户
     *
     * @param userId 所属用户
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取电子邮箱
     *
     * @return email - 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取所属公司
     *
     * @return company - 所属公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置所属公司
     *
     * @param company 所属公司
     */
    public void setCompany(String company) {
        this.company = company;
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

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", agentId=" + agentId +
                ", userId=" + userId +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                ", webSite='" + webSite + '\'' +
                ", qqSite='" + qqSite + '\'' +
                ", friendSite='" + friendSite + '\'' +
                ", douyinSite='" + douyinSite + '\'' +
                ", personalVideoSite='" + personalVideoSite + '\'' +
                ", ximalayaSite='" + ximalayaSite + '\'' +
                ", zifubaoSite='" + zifubaoSite + '\'' +
                '}';
    }
}