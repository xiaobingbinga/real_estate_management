package com.xuetang9.house.houselogin.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author Mr_W
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Util {@AliasFor(annotation = Component.class)
String value() default "";
}
