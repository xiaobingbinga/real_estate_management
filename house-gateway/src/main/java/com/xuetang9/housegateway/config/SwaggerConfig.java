package com.xuetang9.housegateway.config;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName SwaggerConfig
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/18 22:33
 * @Version V1.0
 */
@Component
public class SwaggerConfig implements SwaggerResourcesProvider {

    private static final String SWAGGER2URL = "/v2/api-docs";
    private final RouteLocator routeLocator;

    public SwaggerConfig(RouteLocator routeLocator){
        this.routeLocator = routeLocator;
    }

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        List<Route> routeHosts = new ArrayList<>();
        routeLocator.getRoutes().filter(route -> route.getUri().getHost() != null)
                .filter(route -> !applicationName.equals(route.getUri().getHost()))
                .subscribe(routeHosts::add);
        Set<String> dealed = new HashSet<>();
        routeHosts.forEach(instance -> {
            String str = instance.getPredicate().toString();
            String url = str.substring(str.indexOf("/"),
                    str.indexOf("/",str.indexOf("/")+1))
                    + SWAGGER2URL;
            System.out.println(url);
            if (!dealed.contains(url)) {
                dealed.add(url);
                SwaggerResource swaggerResource = new SwaggerResource();
                swaggerResource.setUrl(url);
                swaggerResource.setName(instance.getUri().getHost());
                resources.add(swaggerResource);
            }
        });
        return resources;
    }
}
