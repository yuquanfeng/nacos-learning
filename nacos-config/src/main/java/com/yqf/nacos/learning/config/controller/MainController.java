package com.yqf.nacos.learning.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
public class MainController {

    @Value("${name}")
    private String name;

    @GetMapping("/test/name")
    public String getName(){
        return name;
    }
}
