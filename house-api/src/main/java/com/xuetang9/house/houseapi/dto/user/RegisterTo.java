package com.xuetang9.house.houseapi.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: RegisterTo
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 18:19
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@ApiModel("注册用户数据传输对象")
public class RegisterTo {
    @ApiModelProperty(value = "账号",example = "admin",required = true)
    private String account;
    @ApiModelProperty(value = "手机号",example = "1999999124",required = true)
    private String mobile;
    @ApiModelProperty(value = "密码",example = "12345",required = true)
    private String password;
    @ApiModelProperty(value = "真实姓名",example = "赵云",required = true)
    private String name;
    @ApiModelProperty(value = "用户昵称",example = "没有昵称",required = true)
    private String nickName;
    @ApiModelProperty(value = "类型",example = "普通用户",required = true)
    private Integer utId;
}
