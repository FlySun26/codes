package com.codes.core.model;

/**
 * 响应状态
 * @author 176****4634
 * @date 2020/05/29 09:12
 */
public interface ResponseStatus {

    /**
     * 获取响应码
     * @author 176****4634
     * @date 2020/05/29 09:12
     */
    String getCode();

    /**
     * 获取响应消息
     * @author 176****4634
     * @date 2020/05/29 09:12
     */
    String getMessage();
}