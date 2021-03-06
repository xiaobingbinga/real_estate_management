package com.xuetang9.house.houselogin.handler;

import com.aliyuncs.exceptions.ClientException;
import com.xuetang9.house.houselogin.annotation.ControllerExceptionHandler;
import com.xuetang9.house.houselogin.exception.FailLoginException;
import com.xuetang9.house.vo.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import springfox.documentation.spring.web.json.Json;

import java.sql.SQLIntegrityConstraintViolationException;
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
        return new JsonResult<Map>().setCode(401).setMessage("用户名或密码错误");
    }

    @ExceptionHandler(ClientException.class)
    public JsonResult handlerVerifyCodeException(ClientException e){
        log.error("验证码发送失败" + e, e);
        return new JsonResult<Map>().setCode(602).setMessage("验证码发送失败");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public JsonResult handlerFailRegisterException(MethodArgumentNotValidException e) {
        log.info("参数错误" + e);
        return new JsonResult().setCode(606).setMessage("注册信息缺失");
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public JsonResult handlerFinallyFailRegisterException(SQLIntegrityConstraintViolationException e) {
        log.info("注册失败" + e, e);
        return new JsonResult().setCode(605).setMessage("最终注册失败");
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public JsonResult handlerHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        log.info("token 获取失败" + e, e);
        return new JsonResult().setCode(401).setMessage("token 获取失败");
    }
}
