package com.xuetang9.househouses.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName: DisplayVo
 * @Description: 房产显示返回对象
 * @Author: 天冬
 * @Date: 2020-08-17 11:50
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@ApiModel("房产列表返回实体类")
public class DisplayVo implements Serializable {
    @Id
    @ApiModelProperty(value = "产品唯一标识",example = "1",required = true)
    private Integer id;

    @ApiModelProperty(value = "房产标题",example = "依澜雅居",required = true)
    private String title;

    @ApiModelProperty(value = "所在省会",example = "合肥",required = true)
    private String city;

    @ApiModelProperty(value = "地址",example = "经开 南艳湖 习友路",required = true)
    private String address;

    @Column(name = "rent_type")
    @ApiModelProperty(value = "租售类型",example = "1",required = true)
    private Integer rentType;

    @ApiModelProperty(value = "价格",example = "650.00",required = true)
    private Float price;

    @ApiModelProperty(value = "面积",example = "15",required = true)
    private Float square;

    @Column(name = "picture_url")
    @ApiModelProperty(value = "房产图片连接地址",example = "w=640&h=480&crop=1",required = true)
    private String pictureUrl;

    @Column(name = "room_number")
    @ApiModelProperty(value = "房间数量",example = "4",required = true)
    private Integer roomNumber;

    @Column(name = "bathroom_number")
    @ApiModelProperty(value = "卫生间数",example = "1",required = true)
    private Integer bathroomNumber;

    @Column(name = "garage_number")
    @ApiModelProperty(value = "车位个数",example = "0",required = true)
    private Integer garageNumber;

    @Column(name = "is_hot")
    @ApiModelProperty(value = "是否是热门房产",example = "0")
    private Byte hot;

    @Column(name = "is_new")
    @ApiModelProperty(value = "是否新增房产",example = "0")
    private Byte news;

    @Column(name = "is_special")
    @ApiModelProperty(value = "是否特色房产",example = "0")
    private Byte special;
}
