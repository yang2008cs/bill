package com.bill.service;

import com.bill.entity.SysRoleMenu;

import java.util.List;

public interface SysRoleMenuSevice {
    List<SysRoleMenu> selectByCondition(SysRoleMenu sysRoleMenu);

    int selectCountByCondition(SysRoleMenu sysRoleMenu);

    int insert(List<SysRoleMenu> sysRoleMenus);

    int deleteByRoleId(String roleId);
}
