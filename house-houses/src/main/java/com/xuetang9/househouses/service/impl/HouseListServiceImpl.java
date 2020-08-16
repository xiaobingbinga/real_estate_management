package com.xuetang9.househouses.service.impl;

import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.mapper.PropertiesMapper;
import com.xuetang9.house.service.impl.BaseServiceImpl;
import com.xuetang9.househouses.service.HouseListService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: HouseListServiceImpl
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-16 15:20
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Service
public class HouseListServiceImpl extends BaseServiceImpl<Properties,Integer,PropertiesMapper>
    implements HouseListService {


    @Override
    public List<Properties> selectCondition(ConditionTo conditionTo) {
        Properties properties = new Properties();
        BeanUtils.copyProperties(conditionTo,properties);
        System.out.println(properties);
        return super.list(properties);
    }

    @Override
    public List<Properties> selectNew(int i) {
        Properties properties = new Properties();
        properties.setNews((byte) 1);
        return super.listByPage(1,i,properties);
    }

    @Override
    public List<Properties> selectAd(int number) {
        Properties properties = new Properties();
        properties.setAd((byte) 1);
        return super.listByPage(1,number,properties);
    }

    @Override
    public List<Properties> selectSpecial(int i) {
        Properties properties = new Properties();
        properties.setSpecial((byte) 1);
        return super.listByPage(1,i,properties);
    }
}
