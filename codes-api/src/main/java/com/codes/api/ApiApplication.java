package com.codes.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 接口应用启动类
 * @author 176****4634
 * @date 2020/05/29 09:12
 */
@SpringBootApplication
@EnableFeignClients("com.codes")
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class);


    }
}
