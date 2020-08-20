package com.xuetang9.house.houseagents.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月16日16:26
 * @address：成都市锦江区西部金融中心
 */
@Data
@ApiModel("代理人详细信息展示传输对象")
@Table(name = "agency")
public class AgentInfoVo {

    /* 代理人的所有详细信息 */

    @Column(name = "user_id")
    @ApiModelProperty(name = "用户编号",example = "1")
    private Long userId;

    @ApiModelProperty(name = "照片地址",example = "http:127.0.0.1:3306/image-1")
    private String photo;

    @ApiModelProperty(name = "代理人真实姓名",example = "罗玉凤")
    private String userName;

    @ApiModelProperty(name = "用户简介",example = "")
    private String brief;

    @ApiModelProperty(name = "用户地址",example = "成都市锦江区东安北路18号")
    private String userAddress;

    @ApiModelProperty(name = "用户座机",example = "88888888")
    private String mobile;

    @ApiModelProperty(name = "用户邮箱",example = "888888@qq.com")
    private String email;

    @ApiModelProperty(name = "个人网站",example = "https://download.csdn.net/user/arkliszeng")
    private String webSite;

    @ApiModelProperty(name = "代理房产数量",example = "2")
    private Integer propertiesCount;

    /* 代理商的信息*/


    @ApiModelProperty(name = "代理商编号")
    private Long agencyId;

    @ApiModelProperty(name = "代理商名称")
    private String agencyName;

    // 代理商营业执照
    @ApiModelProperty(name = "代理商营业制造代码")
    private String license;

    // 代理商座机
    @ApiModelProperty(name = "代理商座机")
    private String agencyPhone;

    // 代理商地址
    @ApiModelProperty(name = "代理商地址")
    private String agencyAddress;



}
