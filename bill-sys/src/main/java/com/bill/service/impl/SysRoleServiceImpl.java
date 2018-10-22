package com.bill.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bill.entity.SysRole;
import com.bill.entity.SysRoleMenu;
import com.bill.mapper.SysRoleMapper;
import com.bill.mapper.SysRoleMenuMapper;
import com.bill.service.SysRoleService;
import com.bill.util.ElasticSearchUtils;
import com.bill.util.Result;
import com.bill.util.ResultUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    public Result insert(SysRole sysRole,String []menus) {
        int data = sysRoleMapper.insert(sysRole);
        List<SysRoleMenu> sysRoleMenus = new ArrayList<>();
        if(menus != null){
           for (String menu : menus){
               SysRoleMenu sysRoleMenu = new SysRoleMenu();
               sysRoleMenu.setMenuId(menu);
               sysRoleMenu.setRoleId(sysRole.getId());
               sysRoleMenus.add(sysRoleMenu);
           }
            sysRoleMenuMapper.insert(sysRoleMenus);
        ElasticSearchUtils.crateIndex(JSONObject.toJSONString(sysRole),"SysRole");
        }
        return ResultUtils.success(data);
    }

    @Override
    public Result update(SysRole sysRole) {
        return ResultUtils.success(sysRoleMapper.update(sysRole));
    }

    @Override
    public Result deleteById(String id) {
        return ResultUtils.success(sysRoleMapper.deleteById(id));
    }

    @Override
    public Result deleteByIds(List ids) {
        return ResultUtils.success(sysRoleMapper.deleteByIds(ids));
    }

    @Override
    public Result selectAll(String roleName,Integer pageIndex, Integer pageSize) {
        Page<SysRole> page = PageHelper.startPage(pageIndex, pageSize);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("roleName", roleName);
        List<SysRole> sysRoles = sysRoleMapper.selectAll(map);
        return ResultUtils.success(sysRoles,page.getTotal());
    }

    @Override
    public SysRole selectById(String id) {
        return sysRoleMapper.selectById(id);
    }
}
