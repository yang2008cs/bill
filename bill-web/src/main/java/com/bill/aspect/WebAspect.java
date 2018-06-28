package com.bill.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.aspect
 * @description: 日志管理
 * @date 2018-06-26 19:13
 */
@Aspect
@Component
public class WebAspect {
    private final static Logger logger = LoggerFactory.getLogger(WebAspect.class);

    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(* com.bill.controller..*(..))")
    public void webLog() {}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        logger.info("========================= request start ==============================");
        long start = System.currentTimeMillis();
        startTime.set(start);
        logger.info("start time: " + start);
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        String url = request.getRequestURL().toString();
        String http_method = request.getMethod();
        String ip = request.getRemoteAddr();
        String class_method = joinPoint.getSignature().getDeclaringTypeName()+ "." + joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        Enumeration<String> enu = request.getParameterNames();
        Map params = new HashMap<String, String>();
        while (enu.hasMoreElements()) {
            String name = (String) enu.nextElement();
            String value = request.getParameter(name);
            params.put(name, value);
        }
        logger.info("url: {}, http_method: {}, ip: {}, class_method: {}, params: {}" ,
                url, http_method, ip, class_method, params);
    }

    @AfterThrowing(value = "webLog()",throwing = "exception")
    public void doAfterThrowing(JoinPoint joinPoint,Throwable exception) {
        logger.info("exception: ", exception.getMessage());
    }

    @AfterReturning(returning = "object", pointcut = "webLog()")
    public void doAfterReturning(Object object) throws Throwable {
        logger.info("response: {}", JSON.toJSONString(object));
        Long end = System.currentTimeMillis();
        logger.info("end time: " + end);
        logger.info("========================= request end ==============================");
        logger.info("spend time : " + (end - startTime.get()));
    }
}
