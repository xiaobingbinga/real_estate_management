package com.xuetang9.house.dto.properties;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 房产查询条件
 *
 * @author Lucky
 * @version 1.0.0
 * @date 2020/8/16 23:30
 * @copyright 老九学堂
 */
@Data
@Accessors(chain = true)
public class ListConditionDto implements Serializable {

    private Integer isNew;
    private Integer isHot;
    private Integer isAd;
    private Integer isSpecial;


}
