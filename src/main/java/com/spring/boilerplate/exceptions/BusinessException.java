package com.spring.boilerplate.exceptions;

import lombok.Data;

@Data
public class BusinessException extends RuntimeException {
    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }
}
