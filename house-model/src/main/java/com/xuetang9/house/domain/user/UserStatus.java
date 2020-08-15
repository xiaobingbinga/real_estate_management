package com.xuetang9.house.domain.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: UserStatus
 * @Description: 用户状态表
 * @Author: 天冬
 * @Date: 2020-08-03 16:54
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("用户状态实体类")
public class UserStatus {
    @ApiModelProperty(value = "用户状态唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "用户状态名称",example = "正常",required = true)
    private String name;
}
