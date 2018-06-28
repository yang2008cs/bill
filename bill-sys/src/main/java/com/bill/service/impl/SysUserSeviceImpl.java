package com.bill.service.impl;

import com.bill.entity.SysUser;
import com.bill.enums.HttpStatusEnums;
import com.bill.mapper.SysUserMapper;
import com.bill.service.SysUserSevice;
import com.bill.util.Md5Util;
import com.bill.util.Result;
import com.bill.util.ResultUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Value("${bill.salt}")
    private String salt;

    @Override
    public Result selectByPage(String username,Integer pageIndex,Integer pageSize) {
        Page<SysUser> page = PageHelper.startPage(pageIndex, pageSize);
        List<SysUser> sysUserList = sysUserMapper.selectAll(username);
        return ResultUtils.success(sysUserList);
    }

    @Override
    public Result selectAll(String username) {
        return ResultUtils.success(sysUserMapper.selectAll(username));
    }

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
        Result result = checkUser(sysUser);
        int i = sysUserMapper.checkUser(sysUser.getUsername());
        if(200 == result.getCode()) {
            sysUser.setPassword(Md5Util.getMD5(sysUser.getPassword(), salt));
            result = ResultUtils.success(sysUserMapper.insert(sysUser));
        }
        return result;
    }

    @Override
    public Result update(SysUser sysUser) {
        return ResultUtils.success(sysUserMapper.update(sysUser));
    }

    @Override
    public Result rePass(SysUser sysUser) {
        return ResultUtils.success(sysUserMapper.rePass(sysUser));
    }

    private Result checkUser(SysUser sysUser) {
        if (sysUser == null) {
            return ResultUtils.error(HttpStatusEnums.NO_DATA, "user");
        }
        /*if (roleIds == null) {
            return ResultUtils.error(HttpStatusEnums.NO_DATA,"roleIds");
        }*/
        if (StringUtils.isEmpty(sysUser.getUsername())) {
            return ResultUtils.error(HttpStatusEnums.PARAM_NULL,"username");
        }
        if (StringUtils.isEmpty(sysUser.getPassword())) {
            return ResultUtils.error(HttpStatusEnums.PARAM_NULL,"password");
        }
        if (sysUser.getPassword().length() < 6) {
            return ResultUtils.error(HttpStatusEnums.TEMP_ERROR,"密码不能小于6位");
        }

        int i = sysUserMapper.checkUser(sysUser.getUsername());
        if(i>0) {
            return ResultUtils.error(HttpStatusEnums.PARAM_UNIQUE, sysUser.getUsername());
        }
        return ResultUtils.success();
    }
}
