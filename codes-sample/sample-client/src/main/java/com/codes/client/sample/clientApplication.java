package com.codes.client.sample;

/**
 * @ClassName clientApplication
 * @Description TODO
 * @Author 孙潇飞
 * @Email flyjson1226@163.com
 * @Date 2020/5/29 10:11
 * @Vertion 1.0
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class clientApplication {
    public static void main(String[] args) {
        SpringApplication.run(clientApplication.class);
    }
}
