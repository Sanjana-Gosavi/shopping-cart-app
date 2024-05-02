package com.prowings.shoppingcartapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.prowings.shoppingcartapp.model.dto.MyCustomError;

import jakarta.servlet.http.HttpServlet;

@ControllerAdvice
public class RestApiCallExceptionHandler {

	public ResponseEntity<MyCustomError> handleSQLException(HttpServlet request, Exception ex){
		
		System.out.println("Inside NotFoundException handler method!!");
		
		MyCustomError customError = new MyCustomError();
		customError.setMessage(ex.getMessage());
		customError.setRootCause("abc");
		customError.setStatusCode(404);
		
		return new ResponseEntity<MyCustomError>(customError, HttpStatus.NOT_FOUND);
		
	}
}
