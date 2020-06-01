package com.codes.core.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 业务异常
 * @author 176****4634
 * @date 2020/05/29 09:12
 */
@Data
@AllArgsConstructor
public class BusinessException extends Exception {

    private String code;

    private String message;
}