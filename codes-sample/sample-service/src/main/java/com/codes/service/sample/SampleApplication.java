package com.codes.service.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 样例服务启动类
 * @author Caesar Liu
 * @date 2019/7/18 13:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class);
    }
}