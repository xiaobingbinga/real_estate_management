package com.xuetang9.house.houseapi.dto.agent;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: AgentTo
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 21:36
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@ApiModel("代理人查询传输对象")
public class AgentTo {
    @ApiModelProperty(value = "代理人唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "账号标识",example = "3",required = true)
    private Integer userId;
}
