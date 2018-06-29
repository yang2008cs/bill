package com.bill.service;

import com.bill.entity.SysLog;
import com.bill.util.Result;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.service
 * @description: 业务层
 * @date 2018-06-29 14:47
 */
public interface SysLogService {
   /**
   *@author LiuYang
   *@methodName insert
   *@description 添加
   *@date 2018/6/29 14:48
   *@param sysLog
   *@return com.bill.util.Result
   **/
    Result insert(SysLog sysLog);
   /**
   *@author LiuYang
   *@methodName selectAll
   *@description 查询
   *@date 2018/6/29 14:48
   *@param sysLog,pageIndex,pageSize
   *@return com.bill.util.Result
   **/
    Result selectAll(SysLog sysLog,Integer pageIndex,Integer pageSize);
}
