package com.bill.service.impl;

import com.bill.entity.SysRoleMenu;
import com.bill.mapper.SysRoleMenuMapper;
import com.bill.service.SysRoleMenuSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleMenuSeviceImpl implements SysRoleMenuSevice {
    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    public List<SysRoleMenu> selectByCondition(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.selectByCondition(sysRoleMenu);
    }

    @Override
    public int selectCountByCondition(SysRoleMenu sysRoleMenu) {
        return sysRoleMenuMapper.selectCountByCondition(sysRoleMenu);
    }

    @Override
    public int insert(List<SysRoleMenu> sysRoleMenus) {
        return sysRoleMenuMapper.insert(sysRoleMenus);
    }

    @Override
    public int deleteByRoleId(String roleId) {
        return sysRoleMenuMapper.deleteByRoleId(roleId);
    }
}
