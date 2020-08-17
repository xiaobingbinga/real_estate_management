package com.xuetang9.house.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ClassName: JsonResult
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 14:46
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@Accessors(chain = true)
@ApiModel("响应消息实体")
public class JsonResult<T> {

    /**
     * 状态码
     */
    @ApiModelProperty(value = "状态码",example = "200",required = true)
    private int code;
    /**
     * 提示信息
     */
    @ApiModelProperty(value = "提示信息")
    private String message;
    /**
     * 响应对象
     */
    @ApiModelProperty(value = "数据实体",required = true)
    private T data;
    /**
     * 登陆凭证
     */
    @ApiModelProperty(value = "登陆凭证",example = "dfsdfsdesa2")
    private String token;
}
