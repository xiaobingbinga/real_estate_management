package com.xuetang9.house.dto.properties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Lucky
 * @version 1.0.0
 * @date 2020/8/15 21:47
 * @copyright 老九学堂
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ApiModel("房产列表查询传输对象")
public class PropertiesSimpleDto implements Serializable {
    /**
     * 房产id
     */
    @ApiModelProperty(value = "房产唯一标识",example = "1",required = true)
    private Integer id;
    /**
     * 标题
     */
    @ApiModelProperty(value = "房产标题",example = "依澜雅居",required = true)
    private String title;
    /**
     * 地址
     */
    @ApiModelProperty(value = "地址",example = "经开 南艳湖 习友路",required = true)
    private String address;
    /**
     * 租售类型
     */
    @ApiModelProperty(value = "租售类型",example = "1",required = true)
    private Integer rentType;
    /**
     * 租期类型
     */
    @ApiModelProperty(value = "租期类型",example = "1")
    private Integer leaseType;
    /**
     * 价格
     */
    @ApiModelProperty(value = "价格",example = "650.00",required = true)
    private Float price;
    /**
     * 房产图片链接地址
     */
    @ApiModelProperty(value = "房产图片链接地址",example = "w=640&h=480&crop=1",required = true)
    private String pictureUrl;
    /**
     * 房产描述信息
     */
    @ApiModelProperty(value = "房产描述信息",example = "室内精装修，拎包入住，客厅宽敞大方，卧室温馨舒适，厨房设施齐全，家具家电齐全，拥有舒心的居住环境",required = true)
    private String description;
    /**
     * 面积
     */
    @ApiModelProperty(value = "面积",example = "150",required = true)
    private Float square;
    /**
     * 房间数量
     */
    @ApiModelProperty(value = "房间数量",example = "5",required = true)
    private Integer roomNumber;
    /**
     * 卫⽣间数
     */
    @ApiModelProperty(value = "卫⽣间数",example = "2",required = true)
    private Integer bathroomNumber;
    /**
     * ⻋位个数
     */
    @ApiModelProperty(value = "⻋位个数",example = "2",required = true)
    private Integer garageNumber;
    /**
     * 是否是热门房产
     */
    @ApiModelProperty(value = "是否是热门房产",example = "1",required = true)
    private Boolean isHot;
    /**
     * 是否是特色房产
     */
    @ApiModelProperty(value = "是否是特色房产",example = "1",required = true)
    private Boolean isSpecial;
}
