package com.xuetang9.demo.test;

import com.xuetang9.demo.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: UserTest
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-12 21:06
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Component
public class UserTest {
    public User addUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("恭喜你成功了！");
        return user;
    }
}
