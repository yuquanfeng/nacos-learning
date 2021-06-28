package com.yqf.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yuquanfeng
 * @Date 2021/6/28
 * @Description
 * @Param
 * @return
 **/
@RestController
public class MainController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test/consumer")
    public String testConsumer(){
        return restTemplate.getForObject("http://nacos-provide/test", String.class);
    }
}
