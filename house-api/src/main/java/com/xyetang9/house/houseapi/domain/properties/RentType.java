package com.xyetang9.house.houseapi.domain.properties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: RentType
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 19:55
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("租售类型实体类")
public class RentType {
    @ApiModelProperty(value = "租售类型唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "租售类型名称",example = "出租",required = true)
    private String name;
}
