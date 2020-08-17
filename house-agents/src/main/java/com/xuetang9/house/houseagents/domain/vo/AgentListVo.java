package com.xuetang9.house.houseagents.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月16日16:16
 * @address：成都市锦江区西部金融中心
 */
@Data
@ApiModel("代理人列表展示传输对象")
public class AgentListVo {

    @ApiModelProperty(name = "代理人用户编号",example = "1")
    private Long userId;

    @ApiModelProperty(name = "代理人邮箱",example = "12345678@qq.com")
    private String  email;

    @ApiModelProperty(name = "代理人手机号",example = "123222111")
    private String phone;

    @ApiModelProperty(name = "代理人真实信息",example = "罗玉凤")
    private String name;

    @ApiModelProperty(name = "代理的房产数量",example = "2")
    private Integer count;

    @ApiModelProperty(name = "代理人照片",example = "http://111.111.1.1/images-1")
    private String photo;

}
