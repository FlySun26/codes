package com.codes.client.sample.test;

import com.codes.core.model.RemoteResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 样例服务客户端
 * @author 176****4634
 * @date 2020/05/29 09:12
 */
@FeignClient("SAMPLE-SERVICE")
public interface SampleClient {

    /**
     * 服务样例接口
     * @author 176****4634
     * @date 2020/05/29 09:12
     */
    @GetMapping("/sample/hello")
    RemoteResponse<String> hello();

}
