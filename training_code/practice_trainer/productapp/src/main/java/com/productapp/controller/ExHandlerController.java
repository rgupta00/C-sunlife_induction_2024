package com.productapp.controller;

import com.productapp.dto.ErrorDetails;
import com.productapp.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExHandlerController {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorDetails> handle404(ProductNotFoundException ex){
		ErrorDetails details=new ErrorDetails();
		details.setDate(new Date());
		details.setMessage(ex.getMessage());
		details.setName("rgupta.mtech@gmail.com");
		details.setStatusCode(HttpStatus.NOT_FOUND.toString());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(details);
	}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handle500(Exception ex){
		ErrorDetails details=new ErrorDetails();
		details.setMessage(ex.getMessage());
		details.setDate(new Date());
		details.setName("rgupta.mtech@gmail.com");
		details.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(details);
	}
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex) {

		Map<String, String> errorMap = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;
	}
}