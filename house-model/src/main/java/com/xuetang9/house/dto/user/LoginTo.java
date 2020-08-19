package com.xuetang9.house.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: LoginTo
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 14:52
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@ApiModel("登录数据传输对象")
public class LoginTo  {

    @ApiModelProperty(value = "账号",example = "admin",required = true)
    private String account;
    @ApiModelProperty(value = "密码",example = "123456",required = true)
    private String password;
//    @ApiModelProperty(value = "手机",example = "18353145781")
//    private String mobile;
}
