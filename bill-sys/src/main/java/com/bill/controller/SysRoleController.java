package com.bill.controller;

import com.bill.entity.SysRole;
import com.bill.service.SysRoleMenuSevice;
import com.bill.service.SysRoleService;
import com.bill.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Api(value = "sysRole-controller", description = "角色接口")
@Controller
@RequestMapping("/sysRole")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @ApiOperation(value = "跳转角色页面", httpMethod = "GET", notes = "跳转角色页面")
    @GetMapping("/queryByPage")
    public String queryByPage() {
        return "system/role/roleList";
    }
    @ApiOperation(value = "查询所有数据", httpMethod = "GET", notes = "查询所有数据")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "java.lang.Integer", name = "pageIndex", value = "代表当前第几页,默认第一页", required = false),
            @ApiImplicitParam(dataType = "java.lang.Integer", name = "pageSize", value = "一页最大显示条数,默认十条", required = false)
    })
    @GetMapping("/roleList")
    @ResponseBody
    public Result roleList(@RequestParam(value = "roleName", required = false) String roleName,
                           @RequestParam(value = "pageIndex", defaultValue = "1", required = false) Integer pageIndex,
                           @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return sysRoleService.selectAll(roleName, pageIndex, pageSize);
    }
    @ApiOperation(value = "添加角色页面", httpMethod = "GET", notes = "添加角色页面")
    @GetMapping("/showAddRole")
    public String showAddRole(){return "system/role/addRole";}

    @ApiOperation(value = "添加角色", httpMethod = "POST", notes = "添加角色")
    @PostMapping("insert")
    @ResponseBody
    public Result insert(SysRole sysRole, String[] menus) {
        return sysRoleService.insert(sysRole,menus);
    }

    @ApiOperation(value = "修改角色页面", httpMethod = "GET", notes = "修改角色页面")
    @GetMapping("/updateRole")
    public String showupdateRole(String id, ModelMap modelMap){
        SysRole sysRole = sysRoleService.selectById(id);
        modelMap.addAttribute("sysRole",sysRole);
        return "system/role/updateRole";}

    @ApiOperation(value = "修改角色", httpMethod = "POST", notes = "修改角色")
    @PostMapping("update")
    @ResponseBody
    public Result update(SysRole sysRole) {
        return sysRoleService.update(sysRole);
    }

}
