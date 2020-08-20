package com.xuetang9.house.vo;

import com.xuetang9.house.domain.Agent;
import com.xuetang9.house.domain.User;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.SwaggerDefinition;
import lombok.Data;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/17 - 14:19
 **/
@Data
@SwaggerDefinition
public class PageAgentListVo {

    /**
     * 用户相关信息
     */
    @ApiModelProperty(name = "", value = "")
    private List<User> pageUser;

    /**
     * 代理人相关信息
     */
    @ApiModelProperty(name = "", value = "")
    private List<Agent> pageAgent;

    /**
     * 房产
     */
    @ApiModelProperty(name = "",value = "")
    private Integer count;
//    /**
//     * 图片地址
//     */
//    @ApiModelProperty(name = "", value = "")
//    private String url ;
//
//    /**
//     * 代理人姓名
//     */
//    @ApiModelProperty(name = "",value = "")
//    private String userName;
//
//    /**
//     * 电话
//     */
//    @ApiModelProperty(name = "",value = "")
//    private String phone;
//
//    /**
//     * qq空间
//     */
//    @ApiModelProperty(name = "",value = "")
//    private String qqSite;
//
//    /**
//     * 朋友圈
//     */
//    @ApiModelProperty(name = "",value = "")
//    private String friendSite;
//
//    /**
//     * 抖音
//     */
//    @ApiModelProperty(name = "",value = "")
//    private String douyinSite;
//
//    /**
//     * 个人小视频
//     */
//    @ApiModelProperty(name = "",value = "")
//    private String personalVideoSite;
//
//    /**
//     * 邮箱
//     */
//    @ApiModelProperty(name = "",value = "")
//    private String email;


}
