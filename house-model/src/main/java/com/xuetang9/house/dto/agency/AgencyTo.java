package com.xuetang9.house.dto.agency;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: AgencyTo
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 21:34
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@ApiModel("代理商查询传输对象")
public class AgencyTo {
    @ApiModelProperty(value = "代理商唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "账号标识",example = "2",required = true)
    private Integer userId;
}
