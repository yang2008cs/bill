package com.bill.mapper;

import com.bill.entity.SysMenu;

import java.util.List;
import java.util.Map;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.mapper
 * @description: 菜单数据层
 * @date 2018-07-03 17:46
 */
public interface SysMenuMapper {
    /**
    *@author LiuYang
    *@methodName insert
    *@description 添加
    *@date 2018/7/3 17:48
    *@param sysMenu
    *@return int
    **/
    int insert(SysMenu sysMenu);
    /**
    *@author LiuYang
    *@methodName update
    *@description 修改
    *@date 2018/7/3 17:48
    *@param sysMenu
    *@return int
    **/
    int update(SysMenu sysMenu);
    /**
    *@author LiuYang
    *@methodName selectAll
    *@description 按条件查询
    *@date 2018/7/3 17:49
    *@param map
    *@return java.util.List<com.bill.entity.SysMenu>
    **/
    List<SysMenu> selectAll(Map<String,Object> map);
    /**
    *@author LiuYang
    *@methodName getChildren
    *@description 查询所有子菜单
    *@date 2018/7/6 18:03
    *@param
    *@return java.util.List<com.bill.entity.SysMenu>
    **/
    List<SysMenu> getChildren();
    /**
    *@author LiuYang
    *@methodName selectById
    *@description 按id查询
    *@date 2018/7/3 17:49
    *@param id
    *@return com.bill.entity.SysMenu
    **/
    SysMenu selectById(String id);

    /**
     * Liuyang
     * 根据pid查询孩子
     * @param pid
     * @return
     */
    List<SysMenu> selectByPid(String pid);
    /**
    *@author LiuYang
    *@methodName deleteById
    *@description 根据id单条删除
    *@date 2018/7/3 17:49
    *@param id
    *@return int
    **/
    int deleteById(String id);
    /**
    *@author LiuYang
    *@methodName deleteByIds
    *@description 根据多个id删除
    *@date 2018/7/3 17:50
    *@param ids
    *@return int
    **/
    int deleteByIds(List ids);
}
