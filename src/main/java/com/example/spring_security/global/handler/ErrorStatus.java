package com.example.spring_security.global.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorStatus {

    _PARSING_ERROR(1001, "응답 파싱 중 오류가 발생했습니다."),
    // 다른 에러 코드도 여기에 정의 가능
    UNAUTHORIZED(1002, "인증이 필요합니다."),
    FORBIDDEN(1003, "접근 권한이 없습니다.");

    private final int code;
    private final String message;
}