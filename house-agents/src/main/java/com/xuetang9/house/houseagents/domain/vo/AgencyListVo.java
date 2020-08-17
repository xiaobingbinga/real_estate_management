package com.xuetang9.house.houseagents.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月16日20:38
 * @address：成都市锦江区西部金融中心
 */
@Data
@ApiModel("代理商列表展示信息传输对象")
public class AgencyListVo  {

    @ApiModelProperty(name = "代理商Id",example = "1")
    private Long id;

    @ApiModelProperty(name = "代理商名称")
    private String name;

    @ApiModelProperty(name = "代理商图标")
    private String icon;

    @ApiModelProperty(name = "代理商名下代理人数量")
    private Integer agentCount;

    @ApiModelProperty(name = "代理商名下房产数量")
    private Integer propertiesCount;

}
