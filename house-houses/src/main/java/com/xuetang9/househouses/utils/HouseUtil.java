package com.xuetang9.househouses.utils;

import com.xuetang9.house.domain.Properties;
import com.xuetang9.househouses.domain.vo.DisplayVo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: HouseUtil
 * @Description: 工具类
 * @Author: 天冬
 * @Date: 2020-08-17 14:05
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
public class HouseUtil {

    /**
     * 集合转换类型
     * @param properties
     * @return
     */
    public static List<DisplayVo> copyList(List<Properties> properties){
        List<DisplayVo> displayVos = new ArrayList<>();
        for (int i = 0; i < properties.size(); i++) {
            DisplayVo displayVo = new DisplayVo();
            BeanUtils.copyProperties(properties.get(i),displayVo);
            displayVos.add(displayVo);
        }
        return displayVos;
    }
}
