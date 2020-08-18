package com.xuetang9.househouses.service;

import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.AddTo;
import com.xuetang9.house.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: HouseInfoService
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-16 15:10
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
public interface HouseInfoService extends BaseService<Properties,Integer> {
    int add(AddTo addInfo);
}
