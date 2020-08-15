package com.xuetang9.house.domain.properties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: Agency
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 19:25
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("代理商信息实体类")
public class Agency {
    @ApiModelProperty(value = "代理商唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "账号标识",example = "2",required = true)
    private Integer userId;
    @ApiModelProperty(value = "企业邮箱",example = "laojiuxuetang@163.com",required = true)
    private String email;
    @ApiModelProperty(value = "营业执照代码",example = "154321567423874564",required = true)
    private Integer license;
    @ApiModelProperty(value = "企业网站",example = "www.laojiuxuetang.com",required = true)
    private String webSite;
    @ApiModelProperty(value = "机构图标",example = "暂时没有",required = true)
    private String icon;
}
