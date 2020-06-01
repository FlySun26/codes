package com.codes.core.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 系统常量
 * @author 176****4634
 * @date 2020/05/29 09:12
 */
public interface Constants {

    /**
     * 通用的响应状态定义
     * @author 176****4634
     * @date 2020/05/29 09:12
     */
    @Getter
    @AllArgsConstructor
    enum ResponseStatus implements com.codes.core.model.ResponseStatus {
        SUCCESS("SUCCESS", "请求成功"),
        FAILED("FAILED", "请求失败"),
        ;
        private String code;

        private String message;
    }

}