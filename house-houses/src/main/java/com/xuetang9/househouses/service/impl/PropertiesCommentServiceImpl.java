package com.xuetang9.househouses.service.impl;

import com.xuetang9.house.domain.PropertiesComment;
import com.xuetang9.house.mapper.PropertiesCommentMapper;
import com.xuetang9.house.service.impl.BaseServiceImpl;
import com.xuetang9.househouses.service.PropertiesCommentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: PropertiesCommentServiceImpl
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-16 17:09
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Service
public class PropertiesCommentServiceImpl extends BaseServiceImpl<PropertiesComment,Integer, PropertiesCommentMapper>
    implements PropertiesCommentService {

    @Override
    public List<PropertiesComment> select(Integer id) {
        PropertiesComment propertiesComment = new PropertiesComment();
        propertiesComment.setId(id);
        return super.list(propertiesComment);
    }
}
