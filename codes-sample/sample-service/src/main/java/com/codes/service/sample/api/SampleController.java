package com.codes.service.sample.api;

import com.codes.core.model.RemoteResponse;
import com.codes.client.sample.test.SampleClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务样例
 * @author 176****4634
 * @date 2020/05/29 09:
 */
@RestController
@RequestMapping("/sample")
public class SampleController implements SampleClient {

    @GetMapping("/hello")
    @Override
    public RemoteResponse<String> hello() {
        return RemoteResponse.success("code issuccess beutiful 意思");

    }

}
