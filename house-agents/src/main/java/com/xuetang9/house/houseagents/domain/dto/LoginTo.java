package com.xuetang9.house.houseagents.domain.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月17日9:03
 * @address：成都市锦江区西部金融中心
 */
@Data
@ApiModel("登录传输对象")
public class LoginTo extends com.xuetang9.house.dto.user.LoginTo {


    public Long UserId;


}
