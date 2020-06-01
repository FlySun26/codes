package com.codes.client.sample.test;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName test
 * @Description TODO
 * @Author 孙潇飞
 * @Email flyjson1226@163.com
 * @Date 2020/5/29 9:37
 * @Vertion 1.0
 **/
@RestController
public class test {
    @Autowired
    SampleClient sampleClient;
    @RequestMapping("test")
    public String get() {
        val hello = sampleClient.hello();
        String s = hello.getData().toString();

        return s+"haha改变电饭锅电饭锅";
    }
}
