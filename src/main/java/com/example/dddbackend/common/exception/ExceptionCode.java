package com.example.dddbackend.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionCode {
    //4XX
    NOT_FOUND(404, "NOT_FOUND", "존재하지 않는 정보"),

    //5XX
    INTERNAL_SERVER_ERROR(500, "NOT_FOUND", "서버 내부 오류")
    ;

    private final int statusCode;
    private final String error;
    private final String message;
}
