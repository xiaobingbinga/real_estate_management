package com.xyetang9.house.houseapi.domain.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: User
 * @Description: 用户表
 * @Author: 天冬
 * @Date: 2020-08-03 14:50
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("用户账号信息实体类")
public class User {

    @ApiModelProperty(value = "用户唯一标识",example = "1",required = true)
    private Integer id;
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
    @ApiModelProperty(value = "用户简介",example = "这个人很懒，啥都没有留下")
    private String brief;
    @ApiModelProperty(value = "地址",example = "四川省成都市双流区电子科技工业园")
    private String address;
    @ApiModelProperty(value = "座机",example = "没得座机")
    private String phone;
    @ApiModelProperty(value = "头像",example = "这个地方是图片地址")
    private String head;
    @ApiModelProperty(value = "注册时间",example = "2020-08-03",required = true)
    private Date regTime;
    @ApiModelProperty(value = "用户状态")
    private UserStatus status;
    @ApiModelProperty(value = "用户类型")
    private UserType utId;

    public User(){}
}
