package com.cms.scaffold.micro.controller.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysMenu/")
public class SysMenuController {

    @GetMapping
    public String index(){
        return "OK";
    }
}
