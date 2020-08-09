package com.qiuhen.bapp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: blog
 * @Package: com.qiuhen.blog.handler
 * @ClassName: ControllerExceptionHandler
 * @Author: qiuhen
 * @Description: 异常处理
 * @Date: 2020/6/28 9:34
 * @Version: 1.0
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exceptionHandler(HttpServletRequest request, Exception e) throws Exception {

        logger.error("Request URL: {}, Exception: {}",request.getRequestURL(),e);

        if(AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null){
            throw e;
        }

        return request.getRequestURI()+"出错:"+e.getMessage();
    }
}
