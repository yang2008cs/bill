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
    *@methodName selectByPage
    *@description 分页查询
    *@date 2018/6/28 18:07
    *@param username, pageIndex, pageSize
    *@return com.bill.util.Result
    **/
    Result selectByPage(String username,Integer pageIndex,Integer pageSize);

    /**
     * @param username
     * @return java.util.List<com.bill.entity.SysUser>
     * @author LiuYang
     * @methodName selectAll
     * @description 按条件查询所有
     * @date 2018/6/28 17:59
     **/
    Result selectAll(String username);

    /**
     * @param id
     * @return com.bill.util.Result
     * @author LiuYang
     * @methodName selectById
     * @description 根据id查询用户
     * @date 2018/6/27 17:09
     **/
    Result selectById(String id);

    /**
     * @param username
     * @return com.bill.util.Result
     * @author LiuYang
     * @methodName checkUser
     * @description 检查账号是否存在
     * @date 2018/6/27 17:09
     **/
    Result checkUser(String username);

    /**
     * @param username
     * @return com.bill.util.Result
     * @author LiuYang
     * @methodName selectByUsername
     * @description 根据账号查询用户
     * @date 2018/6/27 17:09
     **/
    Result selectByUsername(String username);

    /**
     * @param
     * @return com.bill.util.Result
     * @author LiuYang
     * @methodName count
     * @description 查询用户数量
     * @date 2018/6/27 17:09
     **/
    Result count();

    /**
     * @param id
     * @return com.bill.util.Result
     * @author LiuYang
     * @methodName deleteById
     * @description 根据id删除用户
     * @date 2018/6/27 17:09
     **/
    Result deleteById(String id);

    /**
     * @param sysUser
     * @return com.bill.util.Result
     * @author LiuYang
     * @methodName insert
     * @description 添加用户
     * @date 2018/6/27 17:09
     **/
    Result insert(SysUser sysUser);

    /**
     * @param sysUser
     * @return com.bill.util.Result
     * @author LiuYang
     * @methodName update
     * @description 修改用户信息
     * @date 2018/6/27 17:08
     **/
    Result update(SysUser sysUser);

    /**
     * @param sysUser
     * @return com.bill.util.Result
     * @author LiuYang
     * @methodName rePass
     * @description 修改密码
     * @date 2018/6/27 17:08
     **/
    Result rePass(SysUser sysUser);
}
