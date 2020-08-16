package com.xuetang9.house.dto.properties;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;

/**
 * @version 1.0
 * @desc: 新增房产信息传输对象
 * @author: 纪锦浩
 * @data: 2020年08月15日19:49
 * @address：成都市锦江区西部金融中心
 */
@Data
@ApiModel("新增房产信息传输对象")
public class AddTo {

    @ApiModelProperty(value = "房产标题",example = "依澜雅居",required = true)
    private String title;

    @ApiModelProperty(value = "地址",example = "经开 南艳湖 习友路",required = true)
    private String address;

    @ApiModelProperty(value = "状态编号",example = "1",required = true)
    private Integer statusId;

    @ApiModelProperty(value = "租期类型",example = "1", required = true)
    private Integer leaseType;

    @ApiModelProperty(value = "房产类型",example = "1",required = true)
    private Integer type;

    @ApiModelProperty(value = "价格",example = "650.00",required = true)
    private Float price;

    @ApiModelProperty(value = "面积",example = "150",required = true)
    private Float square;

    @ApiModelProperty(value = "房产图片连接地址",example = "w=640&h=480&crop=1",required = true)
    private String pictureUrl;

    @ApiModelProperty(value = "房产视频连接地址",example = "无",required = true)
    private String videoUrl;

    @ApiModelProperty(value = "房产描述信息",example = "室内精装修，拎包入住，客厅宽敞大方，卧室温馨舒适，厨房设施齐全，家具家电齐全，拥有舒心的居住环境",required = true)
    private String description;

    @ApiModelProperty(value = "建造年份",example = "3",required = true)
    private Integer yearType;

    @ApiModelProperty(value = "房间数量",example = "4",required = true)
    private Integer roomNumber;

    @ApiModelProperty(value = "卫生间数",example = "1",required = true)
    private Integer bathroomNumber;

    @ApiModelProperty(value = "厨房个数",example = "1",required = true)
    private Integer kitchenNumber;

    @ApiModelProperty(value = "车位个数",example = "0",required = true)
    private Integer garageNumber;


    @ApiModelProperty(value = "是否有物管",example = "1",required = true)
    private Boolean realtyManagement;


    @ApiModelProperty(value = "通电否",example = "1",required = true)
    private Boolean electric;


    @ApiModelProperty(value = "通气否",example = "1",required = true)
    private Boolean naturalGas;


    @ApiModelProperty(value = "通水否",example = "1",required = true)
    private Boolean water;

    @ApiModelProperty(value = "有空调吗",example = "0",required = true)
    private Boolean airConditioning;


    @ApiModelProperty(value = "有家具(包括床上用品)吗",example = "1",required = true)
    private Boolean furniture;


    @ApiModelProperty(value = "有阳台吗",example = "0",required = true)
    private Boolean balcony;


    @ApiModelProperty(value = "有线电话吗",example = "1",required = true)
    private Boolean cabletv;


    @ApiModelProperty(value = "有车库吗",example = "0",required = true)
    private Boolean parking;


    @ApiModelProperty(value = "带电梯吗",example = "1",required = true)
    private Boolean lift;


    @ApiModelProperty(value = "带游泳池吗",example = "0",required = true)
    private Boolean pool;


    @ApiModelProperty(value = "带洗衣机吗",example = "1",required = true)
    private Boolean dishwater;


    @ApiModelProperty(value = "带冰箱吗",example = "1",required = true)
    private Boolean refrigerator;


    @ApiModelProperty(value = "带厨房用具吗",example = "1",required = true)
    private Boolean kitchenUtensils;

    @ApiModelProperty(value = "经度", example = "121.4095",required = true)
    private String longitude;

    @ApiModelProperty(value = "纬度", example = "31.1796",required = true)
    private String latitude;




}
