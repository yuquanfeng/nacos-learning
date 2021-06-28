package com.yqf.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yuquanfeng
 * @Date 2021/6/28
 * @Description
 * @Param
 * @return
 **/
@RestController
public class MainController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
