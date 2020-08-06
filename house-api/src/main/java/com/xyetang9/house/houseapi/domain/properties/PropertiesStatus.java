package com.xyetang9.house.houseapi.domain.properties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: PropertiesStatus
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 19:47
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("房产状态实体类")
public class PropertiesStatus {
    @ApiModelProperty(value = "房产状态唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "房产状态名称",example = "未出租",required = true)
    private String name;
}
