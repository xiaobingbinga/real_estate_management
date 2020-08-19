package com.xuetang9.househouses.domain.vo;

import com.xuetang9.house.domain.Properties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: PropertiesVo
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-19 10:17
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Data
@ApiModel("房产详情返回实体类")
public class PropertiesVo extends Properties implements Serializable {
    @ApiModelProperty(value = "房产状态",example = "未出租",required = true)
    private String propertiesStatus;
    @ApiModelProperty(value = "房产类型",example = "公寓",required = true)
    private String propertiesType;
    @ApiModelProperty(value = "房产建造年限",example = "2年以上",required = true)
    private String propertiesYearType;
}
