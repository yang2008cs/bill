package com.bill.mapper;

import com.bill.entity.SysLog;

import java.util.List;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.mapper
 * @description: 数据层接口
 * @date 2018-06-29 14:37
 */
public interface SysLogMapper {
    /**
    *@author LiuYang
    *@methodName insert
    *@description 添加
    *@date 2018/6/29 14:39
    *@param sysLog
    *@return int
    **/
    int insert(SysLog sysLog)throws Exception;
    /**
    *@author LiuYang
    *@methodName selectAll
    *@description 查询
    *@date 2018/6/29 14:39
    *@param sysLog
    *@return java.util.List<com.bill.entity.SysLog>
    **/
    List<SysLog> selectAll(SysLog sysLog)throws Exception;
}
