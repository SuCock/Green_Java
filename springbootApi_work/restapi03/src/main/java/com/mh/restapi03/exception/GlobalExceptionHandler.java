package com.mh.restapi03.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.BindException;
import java.time.LocalDateTime;

@ControllerAdvice // 모든오류가 모이도록 하는 어노테이션
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(LogicException.class)
    public final ResponseEntity<ErrorResponse> hanleLogException(LogicException ex){
        ErrorResponse errorResponse = ErrorResponse.builder()
                .errorCode(ex.getErrorCode().getErrorCode())
                .errorMessage(ex.getErrorCode().getMessage())
                .errorDateTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(ex.getErrorCode().getHttpStatus()).body(errorResponse);
    }

    // 모든 예외처리
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponse> handelExeption(UserException e){ // userException의 예외만 받는다
        // getMessage는 test 코드는 HttpStatus.NOT_FOUND
        //AA aa = new AA(e.getMessage(), HttpStatus.NOT_FOUND.toString());
        ErrorResponse errorResponse = ErrorResponse.builder()
                .errorMessage(e.getErrorCode().getMessage())
                .errorCode(e.getErrorCode().getErrorCode())
                .errorDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    private class AA {
        private String test;
        private String code;

        public String getTest() {
            return test;
        }

        public void setTest(String test) {
            this.test = test;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public AA(String test, String code) {
            this.test = test;
            this.code = code;
        }
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        System.out.println("유효성 실패" + ex.getMessage());
        System.out.println("유효성 실패" + ex.getBindingResult());

        ErrorResponse errorResponse = ErrorResponse
                                            .builder()
                                            .errorCode(HttpStatus.BAD_REQUEST.toString())
                                            .errorMessage(ex.getBindingResult().toString())
                                            .errorDateTime(LocalDateTime.now())
                                            .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(errorResponse);
    }
}
