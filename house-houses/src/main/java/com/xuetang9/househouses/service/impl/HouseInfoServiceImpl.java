package com.xuetang9.househouses.service.impl;

import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.AddTo;
import com.xuetang9.house.mapper.PropertiesMapper;
import com.xuetang9.house.service.impl.BaseServiceImpl;
import com.xuetang9.househouses.service.HouseInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @ClassName: HouseInfoServiceImpl
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-16 15:14
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Service
public class HouseInfoServiceImpl extends BaseServiceImpl<Properties,Integer, PropertiesMapper>
    implements HouseInfoService {


    @Override
    public int add(AddTo addInfo) {
        Properties properties = new Properties();
        BeanUtils.copyProperties(addInfo,properties);
        return super.save(properties);
    }
}
