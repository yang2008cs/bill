package com.bill.util;

import com.bill.enums.HttpStatusEnums;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.util
 * @description: 返回结果
 * @date 2018-06-26 19:24
 */
public class ResultUtils {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(HttpStatusEnums.SUCCESS.getCode());
        result.setMsg(HttpStatusEnums.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static Result success(Object object, Long total) {
        Result result = new Result();
        result.setCode(HttpStatusEnums.SUCCESS.getCode());
        result.setMsg(HttpStatusEnums.SUCCESS.getMsg());
        result.setData(object);
        result.setCount(total);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(HttpStatusEnums codesEnum, String ... objs) {
        Result result = new Result();
        String msg = codesEnum.getMsg();
        if (null != objs) {
            msg = String.format(msg,objs);
        }
        result.setCode(codesEnum.getCode());
        result.setMsg(msg);
        return result;
    }
}
