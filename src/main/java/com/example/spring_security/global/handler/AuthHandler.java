package com.example.spring_security.global.handler;
import com.example.spring_security.global.handler.ErrorStatus;


public class AuthHandler extends RuntimeException {

    private final ErrorStatus errorStatus;

    public AuthHandler(ErrorStatus errorStatus) {
        super(errorStatus.getMessage()); // 에러 메시지를 부모 클래스에 전달
        this.errorStatus = errorStatus;
    }

    public ErrorStatus getErrorStatus() {
        return errorStatus;
    }
}
