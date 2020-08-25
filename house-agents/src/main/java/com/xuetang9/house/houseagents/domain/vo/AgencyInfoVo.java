package com.xuetang9.house.houseagents.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月16日21:35
 * @address：成都市锦江区西部金融中心
 */
@Data
public class AgencyInfoVo {


    @ApiModelProperty(name = "代理商编号")
    private Long id;

    @ApiModelProperty(name = "代理商名称")
    private String name;

    @ApiModelProperty(name = "代理商图标")
    private String icon;

    @ApiModelProperty(name = "代理商邮箱")
    private String email;

    @ApiModelProperty(name = "代理商简介")
    private String brief;

    @ApiModelProperty(name = "代理商营业制造代码")
    private String license;

    @ApiModelProperty(name = "代理商座机")
    private String phone;

    @ApiModelProperty(name = "代理商地址")
    private String address;

    @ApiModelProperty(name = "代理商名下代理人数量")
    private Integer agentCount;

    @ApiModelProperty(name = "代理商名下房产数量")
    private Integer propertiesCount;

    @ApiModelProperty(name = "代理编号列表")
    private List<Long> ownerIds;

}
