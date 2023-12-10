package com.hexarware.restapi.exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionHandler {
	
	
	@ResponseStatus()
	@ExceptionHandler({Exception.class})
	public  ResponseEntity<String> handleAnyExp(Exception e)
	{
		System.out.println(" i am global exception handler");
		return new ResponseEntity<String>(e.toString(),HttpStatus.BAD_REQUEST);
	}

}
