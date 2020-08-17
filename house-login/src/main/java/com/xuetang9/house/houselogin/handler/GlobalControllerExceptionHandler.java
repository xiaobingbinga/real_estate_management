package com.xuetang9.house.houselogin.handler;

import com.aliyuncs.exceptions.ClientException;
import com.xuetang9.house.houselogin.annotation.ControllerExceptionHandler;
import com.xuetang9.house.houselogin.exception.FailLoginException;
import com.xuetang9.house.vo.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import springfox.documentation.spring.web.json.Json;

import java.util.Map;

/**
 * @ClassName ControllerExceptionHandler
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/17 11:19
 * @Version V1.0
 */
@Slf4j
@RestControllerAdvice
@ControllerExceptionHandler
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public JsonResult handlerCommonException(Exception e){
        log.error("代码异常" + e, e);
        return new JsonResult<Map>().setCode(500).setMessage("未知错误");
    }

    @ExceptionHandler(FailLoginException.class)
    public JsonResult handlerFailLoginException(FailLoginException e){
        log.error("登录失败" + e, e);
        return new JsonResult<Map>().setCode(401).setMessage("登录失败");
    }

    @ExceptionHandler(ClientException.class)
    public JsonResult handlerVerifyCodeException(ClientException e){
        log.error("验证码发送失败" + e, e);
        return new JsonResult<Map>().setCode(602).setMessage("验证码发送失败");
    }

}
