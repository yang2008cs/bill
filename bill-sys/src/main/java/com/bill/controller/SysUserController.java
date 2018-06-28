package com.bill.controller;

import com.bill.entity.SysUser;
import com.bill.service.SysUserSevice;
import com.bill.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.controller
 * @description: 视图层
 * @date 2018-06-27 17:19
 */
@Api(value = "sysUser-controller", description = "用户接口")
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserSevice sysUserSevice;

    @ApiOperation(value = "添加用户", httpMethod = "POST", notes = "添加用户")
    @PostMapping("insert")
    public Result insert(SysUser sysUser){
        return sysUserSevice.insert(sysUser);
    }

    @ApiOperation(value = "根据账号查询用户", httpMethod = "GET", notes = "根据账号查询用户")
    @GetMapping("selectByUsername")
    public Result selectByUsername(String username){
        return sysUserSevice.selectByUsername(username);
    }
}
