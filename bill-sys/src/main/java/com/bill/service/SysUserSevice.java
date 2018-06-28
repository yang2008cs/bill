package com.bill.service;

import com.bill.entity.SysUser;
import com.bill.util.Result;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.service
 * @description: 业务层接口
 * @date 2018-06-27 17:05
 */
public interface SysUserSevice {
    /**
    *@author LiuYang
    *@methodName selectById
    *@description 根据id查询用户
    *@date 2018/6/27 17:09
    *@param id
    *@return com.bill.util.Result
    **/
    Result selectById(String id);

   /**
   *@author LiuYang
   *@methodName checkUser
   *@description 检查账号是否存在
   *@date 2018/6/27 17:09
   *@param username
   *@return com.bill.util.Result
   **/
    Result checkUser (String username);

    /**
    *@author LiuYang
    *@methodName selectByUsername
    *@description 根据账号查询用户
    *@date 2018/6/27 17:09
    *@param username
    *@return com.bill.util.Result
    **/
    Result selectByUsername(String username);

    /**
    *@author LiuYang
    *@methodName count
    *@description 查询用户数量
    *@date 2018/6/27 17:09
    *@param
    *@return com.bill.util.Result
    **/
    Result count();

    /**
    *@author LiuYang
    *@methodName deleteById
    *@description 根据id删除用户
    *@date 2018/6/27 17:09
    *@param id
    *@return com.bill.util.Result
    **/
    Result deleteById(String id);

    /**
    *@author LiuYang
    *@methodName insert
    *@description 添加用户
    *@date 2018/6/27 17:09
    *@param sysUser
    *@return com.bill.util.Result
    **/
    Result insert(SysUser sysUser);

    /**
    *@author LiuYang
    *@methodName update
    *@description 修改用户信息
    *@date 2018/6/27 17:08
    *@param sysUser
    *@return com.bill.util.Result
    **/
    Result update(SysUser sysUser);
    /**
    *@author LiuYang
    *@methodName rePass
    *@description 修改密码
    *@date 2018/6/27 17:08
    *@param sysUser
    *@return com.bill.util.Result
    **/
    Result rePass(SysUser sysUser);
}
