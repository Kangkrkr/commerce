package com.commerce.core.common.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private boolean success;
    private T data;
    private ErrorResponse error;

    public static <T> ApiResponse<T> success(T data) {
        return ApiResponse.<T>builder()
                .success(true)
                .data(data)
                .build();
    }

    public static ApiResponse<?> error(String code, String message) {
        return ApiResponse.builder()
                .success(false)
                .error(new ErrorResponse(code, message))
                .build();
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ErrorResponse {
        private String code;
        private String message;
    }
}
