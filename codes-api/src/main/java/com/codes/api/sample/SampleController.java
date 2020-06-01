package com.codes.api.sample;

import com.codes.core.model.RemoteResponse;
import com.codes.client.sample.test.SampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 样例接口
 * @author 176****4634
 * @date 2020/05/29 09:12
 */
@RestController
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    private SampleClient sampleClient;

    /**
     * 样例接口
     * @author 176****4634
     * @date 2020/05/29 09:12
     */
    @GetMapping("/hello")
    public String hello() {
        RemoteResponse<String> response = sampleClient.hello();
        System.out.println();
        return response.getData();
    }

}
