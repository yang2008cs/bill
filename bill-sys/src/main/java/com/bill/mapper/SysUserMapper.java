package com.bill.mapper;

import com.bill.entity.SysUser;

import java.util.List;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.mapper
 * @description: 数据层接口
 * @date 2018-06-27 16:14
 */
public interface SysUserMapper {
    /**
    *@author LiuYang
    *@methodName selectAll
    *@description 按条件查询所有
    *@date 2018/6/28 17:58
    *@param username
    *@return java.util.List<com.bill.entity.SysUser>
    **/
    List<SysUser> selectAll(String username);

    /**
    *@author LiuYang
    *@methodName selectById
    *@description 根据id查询用户
    *@date 2018/6/27 17:02
    *@param id
    *@return com.bill.entity.SysUser
    **/
    SysUser selectById(String id);

    /**
    *@author LiuYang
    *@methodName checkUser
    *@description 检查账号是否存在
    *@date 2018/6/27 17:02
    *@param username
    *@return int
    **/
    int checkUser (String username);

    /**
    *@author LiuYang
    *@methodName selectByUsername
    *@description 根据账号查询用户
    *@date 2018/6/27 17:03
    *@param username
    *@return com.bill.entity.SysUser
    **/
    SysUser selectByUsername(String username);

    /**
    *@author LiuYang
    *@methodName count
    *@description 查询用户数量
    *@date 2018/6/27 17:03
    *@param
    *@return java.lang.Long
    **/
    Long count();

    /**
    *@author LiuYang
    *@methodName deleteById
    *@description 根据id删除用户
    *@date 2018/6/27 17:04
    *@param id
    *@return int
    **/
    int deleteById(String id);

    /**
    *@author LiuYang
    *@methodName insert
    *@description 添加用户
    *@date 2018/6/27 17:04
    *@param sysUser
    *@return int
    **/
    int insert(SysUser sysUser);

    /**
    *@author LiuYang
    *@methodName update
    *@description 修改用户信息
    *@date 2018/6/27 17:04
    *@param sysUser
    *@return int
    **/
    int update(SysUser sysUser);
    /**
    *@author LiuYang
    *@methodName rePass
    *@description 修改密码
    *@date 2018/6/27 17:04
    *@param sysUser
    *@return int
    **/
    int rePass(SysUser sysUser);

}
