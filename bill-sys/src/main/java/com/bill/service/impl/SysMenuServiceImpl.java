package com.bill.service.impl;

import com.bill.entity.SysMenu;
import com.bill.entity.SysUser;
import com.bill.mapper.SysMenuMapper;
import com.bill.service.SysMenuService;
import com.bill.util.Result;
import com.bill.util.ResultUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.service.impl
 * @description: 菜单业务层实现
 * @date 2018-07-03 17:53
 */
@Service
public class SysMenuServiceImpl implements SysMenuService{

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public Result insert(SysMenu sysMenu) {
        return ResultUtils.success(sysMenuMapper.insert(sysMenu));
    }

    @Override
    public Result update(SysMenu sysMenu) {
        return ResultUtils.success(sysMenuMapper.update(sysMenu));
    }

    @Override
    public Result selectAll(String name,Integer pageIndex,Integer pageSize) {
        Page<SysMenu> page = PageHelper.startPage(pageIndex, pageSize);
        List<SysMenu> sysMenuList = sysMenuMapper.selectAll(name);
        return ResultUtils.success(sysMenuList);
    }

    @Override
    public Result selectById(String id) {
        return ResultUtils.success(sysMenuMapper.selectById(id));
    }

    @Override
    public Result deleteById(String id) {
        return ResultUtils.success(sysMenuMapper.deleteById(id));
    }

    @Override
    public Result deleteByIds(List ids) {
        return ResultUtils.success(sysMenuMapper.deleteByIds(ids));
    }
}
