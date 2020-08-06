package com.xyetang9.house.houseapi.domain.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: Evaluation
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-04 17:08
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("新闻回复实体类")
public class Evaluation {
    @ApiModelProperty(value = "新闻回复唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "账号标识",example = "6",required = true)
    private Integer userId;
    @ApiModelProperty(value = "新闻标识",example = "1",required = true)
    private String newsId;
    @ApiModelProperty(value = "回复时间",example = "2020-08-04",required = true)
    private Date responseTime;
    @ApiModelProperty(value = "回复内容",example = "小编马没了",required = true)
    private String replyContent;
}
