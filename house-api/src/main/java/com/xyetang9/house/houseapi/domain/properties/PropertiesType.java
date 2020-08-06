package com.xyetang9.house.houseapi.domain.properties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: PropertiesType
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 19:53
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("房产类型实体类")
public class PropertiesType {
    @ApiModelProperty(value = "房产类型唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "房产类型名称",example = "公寓",required = true)
    private String name;
}
