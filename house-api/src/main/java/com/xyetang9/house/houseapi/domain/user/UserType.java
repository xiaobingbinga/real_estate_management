package com.xyetang9.house.houseapi.domain.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: UserType
 * @Description: 用户类型
 * @Author: 天冬
 * @Date: 2020-08-03 17:00
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("用户类型实体类")
public class UserType {
    @ApiModelProperty(value = "用户类型唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "用户类型名称",example = "普通用户",required = true)
    private String name;
}
