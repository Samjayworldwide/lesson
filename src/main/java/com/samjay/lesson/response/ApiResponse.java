package com.samjay.lesson.response;

import lombok.Builder;

@Builder
public class ApiResponse<T> {
    private String message;
}
