package com.codes.core.model;

import com.codes.core.constants.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 服务响应对象
 * @author 176****4634
 * @date 2020/05/29 09:12
 */
@Data
@ToString
@AllArgsConstructor
public class RemoteResponse<T> {
    private String code;

    private String message;

    private T data;

    /**
     * 成功
     * @author 176****4634
     * @date 2020/05/29 09:12
     */
    public static <T> RemoteResponse<T> success(ResponseStatus status, T data) {
        return new RemoteResponse(status.getCode(), status.getMessage(), data);
    }

    /**
     * 成功
     * @author 176****4634
     * @date 2020/05/29 09:12
     */
    public static <T> RemoteResponse<T> success(T data) {
        return success(Constants.ResponseStatus.SUCCESS, data);
    }

    /**
     * 成功
     * @author 176****4634
     * @date 2020/05/29 09:12
     */
    public static <T> RemoteResponse<T> success() {
        return success(null);
    }

    /**
     * 失败
     * @author 176****4634
     * @date 2020/05/29 09:12
     */
    public static <T> RemoteResponse<T> failed(String message) {
        return new RemoteResponse(Constants.ResponseStatus.FAILED.getCode(), message, null);
    }

    /**
     * 失败
     * @author 176****4634
     * @date 2020/05/29 09:12
     */
    public static <T> RemoteResponse<T> failed(ResponseStatus status) {
        return new RemoteResponse(status.getCode(), status.getMessage(), null);
    }
}