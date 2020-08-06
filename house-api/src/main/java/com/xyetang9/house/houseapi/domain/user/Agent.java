package com.xyetang9.house.houseapi.domain.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: Agent
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 19:20
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("代理人信息实体类")
public class Agent {

    @ApiModelProperty(value = "代理人唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "账号标识",example = "3",required = true)
    private Integer userId;
    @ApiModelProperty(value = "代理机构编号",example = "1")
    private Integer agencyId;
    @ApiModelProperty(value = "电子邮箱",example = "157851453@qq.com",required = true)
    private String email;
    @ApiModelProperty(value = "从业证书编号",example = "45673215421545",required = true)
    private String certification;
    @ApiModelProperty(value = "个人网站",example = "www.tdblogs.com")
    private String webSite;
    @ApiModelProperty(value = "QQ空间",example = "https://user.qzone.qq.com/157851453/infocenter")
    private String qqSite;
    @ApiModelProperty(value = "朋友圈",example = "没有朋友圈")
    private String friendSite;
    @ApiModelProperty(value = "抖音",example = "没有抖音")
    private String douyinSite;
    @ApiModelProperty(value = "个人小视频",example = "没有小视频")
    private String personalVideoSite;
    @ApiModelProperty(value = "喜马拉雅",example = "不听广播")
    private String ximalayaSite;
    @ApiModelProperty(value = "支付宝",example = "157851453@qq.com")
    private String zifubaoSite;
    @ApiModelProperty(value = "照片",example = "没有照片")
    private String photo;
    @ApiModelProperty(value = "评分",example = "5")
    private String score;

    public Agent() {
    }
}
