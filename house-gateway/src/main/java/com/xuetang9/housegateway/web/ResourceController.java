package com.xuetang9.housegateway.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger.web.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName ResourceController
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/18 22:38
 * @Version V1.0
 */
@RestController
@RequestMapping("swagger-resources")
public class ResourceController {

    @Resource
    private SwaggerResourcesProvider swaggerResourceProvider;

    @RequestMapping(value = "/configuration/security")
    public ResponseEntity<SecurityConfiguration> securityConfiguration() {
        return new ResponseEntity<>(SecurityConfigurationBuilder.builder().build(), HttpStatus.OK);
    }
    @RequestMapping(value = "/configuration/ui")
    public ResponseEntity<UiConfiguration> uiConfiguration() {
        return new ResponseEntity<>(UiConfigurationBuilder.builder().build(), HttpStatus.OK);
    }
    @RequestMapping
    public ResponseEntity<List<SwaggerResource>> swaggerResources() {
        return new ResponseEntity<>(swaggerResourceProvider.get(), HttpStatus.OK);
    }
}
