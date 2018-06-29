package com.bill.annotation;

import java.lang.annotation.*;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.annotation
 * @description: 记录日志
 * @date 2018-06-29 11:30
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
@Inherited
public @interface Log {
    public enum LOG_TYPE {ADD, UPDATE, DEL, SELECT, ATHOR};

    /** 内容 **/
    String desc();

    /** 类型 curd **/
    LOG_TYPE type() default LOG_TYPE.ATHOR;
}
