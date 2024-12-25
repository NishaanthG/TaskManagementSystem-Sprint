package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> HandleGetFailsException(GetFailsException e){
		ErrorResponse e1 = new ErrorResponse();
		e1.setCode(e.getCode());
		e1.setMessage(e.getMessage());
		
		return new ResponseEntity<ErrorResponse>(e1,HttpStatus.NOT_FOUND);
	}
	
	public ResponseEntity<ErrorResponse> HandleDltFailsException(DeleteFailsException e){
		ErrorResponse e1 = new ErrorResponse();
		e1.setCode(e.getCode());
		e1.setMessage(e.getMessage());
		
		return new ResponseEntity<ErrorResponse>(e1,HttpStatus.NO_CONTENT);
	}

}
