package com.xuetang9.house.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

@Data
@ApiModel("房产信息实体类")
public class Properties implements Serializable {
    @Id
    @ApiModelProperty(value = "产品唯一标识",example = "1",required = true)
    private Integer id;

    /**
     * 出售/出租人编号
     */
    @Column(name = "owner_id")
    @ApiModelProperty(value = "出售/出租人编号",example = "1",required = true)
    private Long ownerId;

    /**
     * 房产标题
     */
    @ApiModelProperty(value = "房产标题",example = "依澜雅居",required = true)
    private String title;

    /**
     * 所在省会
     */
    @ApiModelProperty(value = "所在省会",example = "合肥",required = true)
    private String city;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址",example = "经开 南艳湖 习友路",required = true)
    private String address;

    /**
     * 状态编号
     */
    @Column(name = "status_id")
    @ApiModelProperty(value = "状态编号",example = "1",required = true)
    private Integer statusId;

    /**
     * 租期类型
     */
    @Column(name = "lease_type")
    @ApiModelProperty(value = "租期类型",example = "1")
    private Integer leaseType;

    /**
     * 租期
     */
    @ApiModelProperty(value = "租期",example = "30")
    private Integer lease;

    /**
     * 房产类型
     */
    @ApiModelProperty(value = "房产类型",example = "1",required = true)
    private Integer type;

    /**
     * 租售类型
     */
    @Column(name = "rent_type")
    @ApiModelProperty(value = "租售类型",example = "1",required = true)
    private Integer rentType;

    /**
     * 价格
     */
    @ApiModelProperty(value = "价格",example = "650.00",required = true)
    private Float price;

    /**
     * 面积
     */
    @ApiModelProperty(value = "面积",example = "15",required = true)
    private Float square;

    /**
     * 房产图片连接地址
     */
    @Column(name = "picture_url")
    @ApiModelProperty(value = "房产图片连接地址",example = "w=640&h=480&crop=1",required = true)
    private String pictureUrl;

    /**
     * 房产视频连接地址
     */
    @Column(name = "video_url")
    @ApiModelProperty(value = "房产视频连接地址",example = "无",required = true)
    private String videoUrl;

    /**
     * 房产描述信息
     */
    @ApiModelProperty(value = "房产描述信息",example = "室内精装修，拎包入住，客厅宽敞大方，卧室温馨舒适，厨房设施齐全，家具家电齐全，拥有舒心的居住环境",required = true)
    private String description;

    /**
     * 建造年份
     */
    @ApiModelProperty(value = "建造年份",example = "3",required = true)
    @Column(name = "year_type")
    private Integer yearType;

    /**
     * 房间数量
     */
    @Column(name = "room_number")
    @ApiModelProperty(value = "房间数量",example = "4",required = true)
    private Integer roomNumber;

    /**
     * 卫生间数
     */
    @Column(name = "bathroom_number")
    @ApiModelProperty(value = "卫生间数",example = "1",required = true)
    private Integer bathroomNumber;

    /**
     * 厨房个数
     */
    @Column(name = "kitchen_number")
    @ApiModelProperty(value = "厨房个数",example = "1",required = true)
    private Integer kitchenNumber;

    /**
     * 车位个数
     */
    @Column(name = "garage_number")
    @ApiModelProperty(value = "车位个数",example = "0",required = true)
    private Integer garageNumber;

    /**
     * 是否有物管
     */
    @Column(name = "is_realty_management")
    @ApiModelProperty(value = "是否有物管",example = "1",required = true)
    private Byte realtyManagement;

    /**
     * 通电否
     */
    @Column(name = "is_electric")
    @ApiModelProperty(value = "通电否",example = "1",required = true)
    private Byte electric;

    /**
     * 通气否
     */
    @Column(name = "is_natural_gas")
    @ApiModelProperty(value = "通气否",example = "1",required = true)
    private Byte naturalGas;

    /**
     * 通水否
     */
    @Column(name = "is_water")
    @ApiModelProperty(value = "通水否",example = "1",required = true)
    private Byte water;

    /**
     * 有空调吗
     */
    @Column(name = "is_air_conditioning")
    @ApiModelProperty(value = "有空调吗",example = "0",required = true)
    private Byte airConditioning;

    /**
     * 有家具(包括床上用品)吗
     */
    @Column(name = "is_furniture")
    @ApiModelProperty(value = "有家具(包括床上用品)吗",example = "1",required = true)
    private Byte furniture;

    /**
     * 有阳台吗
     */
    @Column(name = "is_balcony")
    @ApiModelProperty(value = "有阳台吗",example = "0",required = true)
    private Byte balcony;

    /**
     * 有线电话吗
     */
    @Column(name = "is_cableTV")
    @ApiModelProperty(value = "有线电话吗",example = "1",required = true)
    private Byte cabletv;

    /**
     * 有车库吗
     */
    @Column(name = "is_parking")
    @ApiModelProperty(value = "有车库吗",example = "0",required = true)
    private Byte parking;

    /**
     * 带电梯吗
     */
    @Column(name = "is_lift")
    @ApiModelProperty(value = "带电梯吗",example = "1",required = true)
    private Byte lift;

    /**
     * 带游泳池吗
     */
    @Column(name = "is_pool")
    @ApiModelProperty(value = "带游泳池吗",example = "0",required = true)
    private Byte pool;

    /**
     * 带洗衣机吗
     */
    @Column(name = "is_dishwater")
    @ApiModelProperty(value = "带洗衣机吗",example = "1",required = true)
    private Byte dishwater;

    /**
     * 带冰箱吗
     */
    @Column(name = "is_refrigerator")
    @ApiModelProperty(value = "带冰箱吗",example = "1",required = true)
    private Byte refrigerator;

    /**
     * 带厨房用具吗
     */
    @Column(name = "is_kitchen_utensils")
    @ApiModelProperty(value = "带厨房用具吗",example = "1",required = true)
    private Byte kitchenUtensils;

    /**
     * 推荐指数
     */
    @ApiModelProperty(value = "推荐指数",example = "0")
    private Integer recommend;

    /**
     * 是否是热门房产
     */
    @Column(name = "is_hot")
    @ApiModelProperty(value = "是否是热门房产",example = "0")
    private Byte hot;

    /**
     * 是否新增房产
     */
    @Column(name = "is_new")
    @ApiModelProperty(value = "是否新增房产",example = "0")
    private Byte news;

    /**
     * 是否广告位房产
     */
    @Column(name = "is_ad")
    @ApiModelProperty(value = "是否广告位房产",example = "0")
    private Byte ad;

    /**
     * 是否特色房产
     */
    @Column(name = "is_special")
    @ApiModelProperty(value = "是否特色房产",example = "0")
    private Byte special;

    private static final long serialVersionUID = 1L;
}