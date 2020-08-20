package com.xuetang9.house.vo;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.SwaggerDefinition;
import lombok.Data;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/17 - 16:46
 **/
@Data
@SwaggerDefinition
public class AgentConditionVo {

    /**
     * 代理人名字
     */
    @ApiModelProperty(name = "",value = "")
    private String userName;

    /**
     * 地址
     */
    @ApiModelProperty(name = "",value = "")
    private String address;

    /**
     * 电话
     */
    @ApiModelProperty(name = "",value = "电话")
    private String mobile;


    /**
     * 邮箱
     */
    @ApiModelProperty(name = "",value = "邮箱")
    private String email;

    /**
     * 个人网站
     */
    @ApiModelProperty(name = "",value = "个人网站")
    private String webSite;

    /**
     * 房产数量
     */
    @ApiModelProperty(name = "",value = "房产数量")
    private int count;

    /**
     * 代理机构
     */
    @ApiModelProperty(name = "",value = "代理机构")
    private String license;


    /**
     * 公司名称
     */
    @ApiModelProperty(name = "",value = "公司名称")
    private String company;

    /**
     * 从业证书许可证
     */
    @ApiModelProperty(name = "",value = "从业证书许可证")
    private String certification;

    /**
     * 房子面积
     */
    @ApiModelProperty(name = "",value = "房子面积")
    private float square;


    /**
     * 房间数量
     */
    @ApiModelProperty(name = "",value = "房间数量")
    private Integer roomNumber;

    /**
     * 卫生间数量
     */
    @ApiModelProperty(name = "",value = "卫生间数量")
    private Integer bathroomNumber;

    /**
     * 车位个数
     */
    @ApiModelProperty(name = "",value = "车位个数")
    private Integer garageNumber;

    /**
     * 房子地址
     */
    @ApiModelProperty(name = "",value = "房子地址")
    private String houseAddress;

    /**
     * 房子类型
     */
    @ApiModelProperty(name = "",value = "房子类型")
    private String houseTitle;

    /**
     * 房子价格
     */
    @ApiModelProperty(name = "",value = "房子价格")
    private float price;

    /**
     * 租售类型
     */
    @ApiModelProperty(name = "",value = "租售类型")
    private String rentType;
}
