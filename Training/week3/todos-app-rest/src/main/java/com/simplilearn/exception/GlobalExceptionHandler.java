package com.simplilearn.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(TodoNotFoundException.class)
	public ResponseEntity<String> handleTodoNotFoundException (TodoNotFoundException ex,HttpServletRequest request){
		ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), request.getRequestURI());
		return new ResponseEntity(errorResponse,HttpStatus.NOT_FOUND); // 404
	}

}
