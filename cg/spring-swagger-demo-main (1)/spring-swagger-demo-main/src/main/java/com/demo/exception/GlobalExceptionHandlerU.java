package com.demo.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerU {
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<?> AddressNotFoundHandling(UserNotFoundException exception){
	ErrorDetails errormessage=new ErrorDetails("UserNotFound",exception.getMessage() ,new Date());
	return new ResponseEntity<>(errormessage,HttpStatus.NOT_FOUND);

}
	
	
		@ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<?> CustomValidationErrorHandling(MethodArgumentNotValidException exception){
		ErrorDetails errormessage=new ErrorDetails("Validation Error",exception.getBindingResult().getFieldError().getDefaultMessage() ,new Date());
		return new ResponseEntity<>(errormessage,HttpStatus.BAD_REQUEST);

	}
		
			@ExceptionHandler(HttpMessageNotReadableException.class)
			public ResponseEntity<?> handleException(HttpMessageNotReadableException exception, HttpServletRequest request){
			ErrorDetails errormessage=new ErrorDetails("Validation Error","Incorrect Date format, Enter date in the format. Enter date in the format yyyy.mm.dd",new Date());
			return new ResponseEntity<>(errormessage,HttpStatus.BAD_REQUEST);

		}
			
		
}