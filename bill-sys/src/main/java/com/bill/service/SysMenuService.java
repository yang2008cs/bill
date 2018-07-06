package com.bill.service;

import com.bill.entity.SysMenu;
import com.bill.util.Result;

import java.util.List;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.service
 * @description: 菜单业务层
 * @date 2018-07-03 17:50
 */
public interface SysMenuService {
    /**
    *@author LiuYang
    *@methodName insert
    *@description 添加
    *@date 2018/7/3 17:51
    *@param sysMenu
    *@return com.bill.util.Result
    **/
    Result insert(SysMenu sysMenu);
    /**
    *@author LiuYang
    *@methodName update
    *@description 修改
    *@date 2018/7/3 17:51
    *@param sysMenu
    *@return com.bill.util.Result
    **/
    Result update(SysMenu sysMenu);
   /**
   *@author LiuYang
   *@methodName selectAll
   *@description 按条件查询
   *@date 2018/7/3 17:52
    *@return com.bill.util.Result
   *
    * @param name,pageIndex,pageSize*/
   Result selectAll(String name, Integer pageIndex, Integer pageSize);
    /**
    *@author LiuYang
    *@methodName selectById
    *@description 按id查询
    *@date 2018/7/3 17:52
    *@param id
    *@return com.bill.util.Result
    **/
    Result selectById(String id);
    /**
    *@author LiuYang
    *@methodName deleteById
    *@description 根据id单条删除
    *@date 2018/7/3 17:52
    *@param id
    *@return com.bill.util.Result
    **/
    Result deleteById(String id);
    /**
    *@author LiuYang
    *@methodName deleteByIds
    *@description 根据多个id删除
    *@date 2018/7/3 17:52
    *@param ids
    *@return com.bill.util.Result
    **/
    Result deleteByIds(List ids);
}
