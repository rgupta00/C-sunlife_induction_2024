package com.bankapp.controller;

import com.bankapp.dto.ErrorDetails;
import com.bankapp.exceptions.BankAccountNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class BankAppExHandlerController {
    @ExceptionHandler(BankAccountNotFoundException.class)
    public ResponseEntity<ErrorDetails>
        handle404(BankAccountNotFoundException ex){
        ErrorDetails errorDetails=new ErrorDetails();
        errorDetails.setToContact("sunlife.teamA@sunlife.com");
        errorDetails.setTimeStamp(LocalDateTime.now());
        errorDetails.setMessage(ex.getMessage());
        errorDetails.setStatusCode(HttpStatus.NOT_FOUND.toString());
        return  ResponseEntity
                .status(HttpStatus.NOT_FOUND).body(errorDetails);
    }
}
