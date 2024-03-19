package com.mh.restapi05.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatusCode status,
                                                                  WebRequest request) {
        List<String> list = Arrays.asList("a","bb","ccc");
/*
        List<Integer> alist = new ArrayList<>();

        for ( String temp : list){
            alist.add(temp.length());
        }
  */
        List<Integer> ilist = list.stream().map( a -> a.length() ).collect(Collectors.toList());

//        List<FieldError> list = ex.getBindingResult().getFieldErrors();
//
//        List<String> errorMessage = new ArrayList<>();
//        List<String> errorReason = new ArrayList<>();
//
//        // getFieldErrors = email, password, username list에 담긴다
//        for(FieldError error : list){
//            System.out.println("error.getField() = " + error.getField());
//            System.out.println("error.getDefaultMessage() = " + error.getDefaultMessage());
//            System.out.println("error.getCode() = " + error.getCode());
//        }

        List<String> errorMessage = ex.getBindingResult().getFieldErrors().stream()
                .map(error -> error.getCode())
                .collect(Collectors.toList());
        List<String> errorReason = ex.getBindingResult().getFieldErrors().stream()
                .map(error -> error.getField() + " : " + error.getDefaultMessage())
                .collect(Collectors.toList());

        ErrorResponse response = ErrorResponse.builder()
                .message(errorMessage.toString())
                .reason(errorReason.toString())
                .build();
        
        // stream으로 출력
//        list.stream().forEach(error ->{
//            System.out.println("error.getField() = " + error.getField());
//            System.out.println("error.getDefaultMessage() = " + error.getDefaultMessage());
//            System.out.println("error.getCode() = " + error.getCode());
//        });
        
        ErrorResponse errorResponse = ErrorResponse.builder()
                .message("잘못된 요청입니다. " + ex.getBindingResult().getFieldErrors())
                .reason("유효성 검사 실패 " + ex.getBindingResult().getFieldError().getDefaultMessage())
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
