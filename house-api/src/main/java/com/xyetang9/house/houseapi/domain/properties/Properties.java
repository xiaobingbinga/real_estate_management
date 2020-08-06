package com.xyetang9.house.houseapi.domain.properties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: Properties
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 19:05
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("房产信息实体类")
public class Properties {

    @ApiModelProperty(value = "产品唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "出售/出租人编号",example = "1",required = true)
    private Integer ownerId;
    @ApiModelProperty(value = "房产标题",example = "依澜雅居",required = true)
    private String title;
    @ApiModelProperty(value = "所在省会",example = "合肥",required = true)
    private String city;
    @ApiModelProperty(value = "地址",example = "经开 南艳湖 习友路",required = true)
    private String address;
    @ApiModelProperty(value = "状态编号",example = "1",required = true)
    private Integer statusId;
    @ApiModelProperty(value = "租期类型",example = "1")
    private Integer leaseType;
    @ApiModelProperty(value = "租期",example = "30")
    private Integer lease;
    @ApiModelProperty(value = "房产类型",example = "1",required = true)
    private Integer type;
    @ApiModelProperty(value = "租售类型",example = "1",required = true)
    private Integer rentType;
    @ApiModelProperty(value = "价格",example = "650.00",required = true)
    private Double price;
    @ApiModelProperty(value = "面积",example = "15",required = true)
    private Double square;
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
    private Integer realtyManagement;
    @ApiModelProperty(value = "通电否",example = "1",required = true)
    private Integer electric;
    @ApiModelProperty(value = "通气否",example = "1",required = true)
    private Integer naturalGas;
    @ApiModelProperty(value = "通水否",example = "1",required = true)
    private Integer water;
    @ApiModelProperty(value = "有空调吗",example = "0",required = true)
    private Integer airConditioning;
    @ApiModelProperty(value = "有家具(包括床上用品)吗",example = "1",required = true)
    private Integer furniture;
    @ApiModelProperty(value = "有阳台吗",example = "0",required = true)
    private Integer balcony;
    @ApiModelProperty(value = "有线电话吗",example = "1",required = true)
    private Integer cableTV;
    @ApiModelProperty(value = "有车库吗",example = "0",required = true)
    private Integer parking;
    @ApiModelProperty(value = "带电梯吗",example = "1",required = true)
    private Integer lift;
    @ApiModelProperty(value = "带游泳池吗",example = "0",required = true)
    private Integer pool;
    @ApiModelProperty(value = "带洗衣机吗",example = "1",required = true)
    private Integer dishwater;
    @ApiModelProperty(value = "带冰箱吗",example = "1",required = true)
    private Integer refrigerator;
    @ApiModelProperty(value = "带厨房用具吗",example = "1",required = true)
    private Integer kitchenUtensils;
    @ApiModelProperty(value = "推荐指数",example = "0")
    private Integer recommend;
    @ApiModelProperty(value = "是否是热门房产",example = "0")
    private Integer hot;
    @ApiModelProperty(value = "是否新增房产",example = "0")
    private Integer news;
    @ApiModelProperty(value = "是否广告位房产",example = "0")
    private Integer ad;
    @ApiModelProperty(value = "是否特色房产",example = "0")
    private Integer special;

    public Properties() {
    }
}
