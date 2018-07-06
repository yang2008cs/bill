package com.bill.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.controller
 * @description: TODO
 * @date 2018-07-04 14:46
 */
@Api(value = "sysMenu-controller", description = "菜单接口")
@Controller
public class LoginController {

    @RequestMapping("/main")
   public String main (){
       return "index";
   }
}
