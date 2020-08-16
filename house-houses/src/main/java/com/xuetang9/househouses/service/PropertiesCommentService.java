package com.xuetang9.househouses.service;

import com.xuetang9.house.domain.PropertiesComment;
import com.xuetang9.house.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: PropertiesCommentService
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-16 17:08
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Service
public interface PropertiesCommentService extends BaseService<PropertiesComment,Integer> {
    List<PropertiesComment> select(Integer id);
}
