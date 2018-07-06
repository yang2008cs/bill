package com.bill.controller;

import com.bill.entity.SysMenu;
import com.bill.service.SysMenuService;
import com.bill.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.controller
 * @description: 菜单视图层
 * @date 2018-07-03 17:58
 */
@Api(value = "sysMenu-controller", description = "菜单接口")
@Controller
@RequestMapping("/sysMenu")
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("showAddMenu")
    public String showAddMenu(){
        return "system/menu/addMenu";
    }

    @ApiOperation(value = "添加菜单", httpMethod = "POST", notes = "添加菜单")
    @PostMapping("insert")
    @ResponseBody
    public Result insert(SysMenu sysMenu) {
        return sysMenuService.insert(sysMenu);
    }

    @ApiOperation(value = "修改菜单", httpMethod = "POST", notes = "修改菜单")
    @PostMapping("update")
    @ResponseBody
    public Result update(SysMenu sysMenu) {
        return sysMenuService.update(sysMenu);
    }

    @ApiOperation(value = "跳转菜单页面", httpMethod = "GET", notes = "跳转菜单页面")
    @GetMapping("/queryByPage")
    public String queryByPage() {
        return "system/menu/menuList";
    }

    @ApiOperation(value = "查询所有数据", httpMethod = "GET", notes = "查询所有数据")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "java.lang.Integer", name = "pageIndex", value = "代表当前第几页,默认第一页", required = false),
            @ApiImplicitParam(dataType = "java.lang.Integer", name = "pageSize", value = "一页最大显示条数,默认十条", required = false)
    })
    @GetMapping("/menuList")
    @ResponseBody
    public Result menuList(@RequestParam(value = "name", required = false) String name,
                                  @RequestParam(value = "pageIndex", defaultValue = "1", required = false) Integer pageIndex,
                                  @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return sysMenuService.selectAll(name, pageIndex, pageSize);

    }
}
