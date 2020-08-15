package com.xuetang9.house.domain.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: Owner
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 19:14
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@ApiModel("出租/出售人员信息实体类")
public class Owner {

    @ApiModelProperty(value = "用户唯一标识",example = "1",required = true)
    private Integer id;
    @ApiModelProperty(value = "关联代理人",example = "1")
    private Integer agentId;
    @ApiModelProperty(value = "账号标识",example = "4",required = true)
    private Integer userId;
    @ApiModelProperty(value = "电子邮箱",example = "157851453@qq.com")
    private String email;
    @ApiModelProperty(value = "所属公司",example = "老九学堂")
    private String company;
    @ApiModelProperty(value = "个人网站",example = "www.tdblogs.com")
    private String webSite;
    @ApiModelProperty(value = "QQ空间",example = "https://user.qzone.qq.com/157851453/infocenter")
    private String qqSite;
    @ApiModelProperty(value = "朋友圈",example = "没有朋友圈")
    private String friendSite;
    @ApiModelProperty(value = "抖音",example = "没有抖音")
    private String douyinSite;
    @ApiModelProperty(value = "个人小视频",example = "没有视频")
    private String personalVideoSite;
    @ApiModelProperty(value = "喜马拉雅",example = "不听广播")
    private String ximalayaSite;
    @ApiModelProperty(value = "支付宝",example = "157851453@qq.com")
    private String zifubaoSite;
}
