package com.xuetang9.house.domain.news;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: News
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-04 13:42
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("新闻信息实体类")
public class News {
    @ApiModelProperty(value = "新闻唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "账号标识",example = "5",required = true)
    private Integer userId;
    @ApiModelProperty(value = "标题",example = "震惊！某公寓竟发生这种事！",required = true)
    private String title;
    @ApiModelProperty(value = "文章内容",example = "据了解，某公寓物业从不处理垃圾，导致垃圾都被垃圾回收站拉走了。",required = true)
    private String content;
    @ApiModelProperty(value = "文章内容",example = "公寓物业竟然做出这种事！真是令人发指！",required = true)
    private String summary;
    @ApiModelProperty(value = "发表时间",example = "2020-08-04",required = true)
    private Date issuingTime;
    @ApiModelProperty(value = "标签",example = "爆料",required = true)
    private String label;
    @ApiModelProperty(value = "图片地址",example = "暂时没有")
    private String imageUrl;
}
