package com.xuetang9.house.dto.properties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @desc: 分页传输对象
 * @author: 纪锦浩
 * @data: 2020年08月15日19:26
 * @address：成都市锦江区西部金融中心
 */
@Data
@ApiModel("分页信息传输对象")
public class PageTo {



    @ApiModelProperty(value = "每页显示数据条数",example = "5",required = true)
    private Integer pageSize;

    @ApiModelProperty(value = "当前显示的页码",example = "1",required = true)
    private Integer pageNum;

}
