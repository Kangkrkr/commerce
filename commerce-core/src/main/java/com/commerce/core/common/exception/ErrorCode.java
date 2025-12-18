package com.commerce.core.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    // Common
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "C001", "Invalid Input Value"),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "C002", "Method Not Allowed"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "C003", "Server Error"),
    
    // User
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "U001", "User Not Found"),
    DUPLICATE_EMAIL(HttpStatus.BAD_REQUEST, "U002", "Email Already Exists");

    private final HttpStatus status;
    private final String code;
    private final String message;
}
