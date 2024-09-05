package com.productapp.controller;

import com.productapp.dto.ErrorDetails;
import com.productapp.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice //it use AOP* under the hood
public class ExHandlerController {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorDetails> handle404(ProductNotFoundException ex){
        ErrorDetails errorDetails=ErrorDetails
                .builder()
                .date(LocalDateTime.now())
                .name("raj@sunlife.com")
                .statusCode(HttpStatus.NOT_FOUND.toString())
                .message(ex.getMessage())
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDetails);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handle500(Exception ex){
        ErrorDetails errorDetails=ErrorDetails
                .builder()
                .date(LocalDateTime.now())
                .name("raj@sunlife.com")
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString())
                .message("pls try after some time")
                .build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorDetails);
    }
}
