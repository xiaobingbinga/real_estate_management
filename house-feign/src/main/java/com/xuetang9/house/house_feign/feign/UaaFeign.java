package com.xuetang9.house.house_feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @ClassName UaaFeign
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/20 22:02
 * @Version V1.0
 */
@FeignClient("House-UAA")
@RequestMapping("user")
public interface UaaFeign {

    @PostMapping("token")
    public String readToken(@RequestBody Map<String, String> parameters);

}
