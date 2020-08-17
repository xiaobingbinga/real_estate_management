package com.xuetang9.house.dto.properties;

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
public class PropertiesSimpleDto implements Serializable {
    /**
     * 房产id
     */
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 地址
     */
    private String address;
    /**
     * 租售类型
     */
    private Integer rentType;
    /**
     * 租期类型
     */
    private Integer leaseType;
    /**
     * 价格
     */
    private Float price;
    /**
     * 房产图片链接地址
     */
    private String pictureUrl;
    /**
     * 房产描述信息
     */
    private String description;
    /**
     * 面积
     */
    private Float square;
    /**
     * 房间数量
     */
    private Integer roomNumber;
    /**
     * 卫⽣间数
     */
    private Integer bathroomNumber;
    /**
     * ⻋位个数
     */
    private Integer garageNumber;
    /**
     * 是否是热门房产
     */
    private Boolean isHot;
    /**
     * 是否是特色房产
     */
    private Boolean isSpecial;
}
