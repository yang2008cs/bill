package com.bill.service.impl;

import com.bill.entity.SysUser;
import com.bill.mapper.SysUserMapper;
import com.bill.service.SysUserSevice;
import com.bill.util.Result;
import com.bill.util.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.service.impl
 * @description: 业务层实现
 * @date 2018-06-27 17:14
 */
@Service
public class SysUserSeviceImpl implements SysUserSevice{

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public Result selectById(String id) {
        return ResultUtils.success(sysUserMapper.selectById(id));
    }

    @Override
    public Result checkUser(String username) {
        return ResultUtils.success(sysUserMapper.checkUser(username));
    }

    @Override
    public Result selectByUsername(String username) {
        return ResultUtils.success(sysUserMapper.selectByUsername(username));
    }

    @Override
    public Result count() {
        return ResultUtils.success(sysUserMapper.count());
    }

    @Override
    public Result deleteById(String id) {
        return ResultUtils.success(sysUserMapper.deleteById(id));
    }

    @Override
    public Result insert(SysUser sysUser) {
        return ResultUtils.success(sysUserMapper.insert(sysUser));
    }

    @Override
    public Result update(SysUser sysUser) {
        return ResultUtils.success(sysUserMapper.update(sysUser));
    }

    @Override
    public Result rePass(SysUser sysUser) {
        return ResultUtils.success(sysUserMapper.rePass(sysUser));
    }
}
