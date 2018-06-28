package com.bill.util;

import lombok.Getter;
import lombok.Setter;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.util
 * @description: 结果
 * @date 2018-06-26 19:23
 */
@Setter
@Getter
public class Result<T> {

    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 具体内容 */
    private T data;

    /** 总记录数 */
    private Long total;
}

