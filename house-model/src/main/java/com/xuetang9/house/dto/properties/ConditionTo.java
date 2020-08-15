package com.xuetang9.house.dto.properties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: ConditionTo
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 20:17
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@ApiModel("房产查询传输对象")
public class ConditionTo {
    @ApiModelProperty(value = "状态编号",example = "1",required = true)
    private Integer statusId;
    @ApiModelProperty(value = "房产类型",example = "1",required = true)
    private Integer type;
    @ApiModelProperty(value = "所在省会",example = "成都",required = true)
    private String city;
    @ApiModelProperty(value = "房间数量",example = "4",required = true)
    private Integer roomNumber;
    @ApiModelProperty(value = "卫生间数",example = "1",required = true)
    private Integer bathroomNumber;
}
