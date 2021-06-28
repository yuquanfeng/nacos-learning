package com.yqf.nacos.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yuquanfeng
 * @Date 2021/6/28
 * @Description
 * @Param
 * @return
 **/
@Configuration
public class ConfigurationBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
