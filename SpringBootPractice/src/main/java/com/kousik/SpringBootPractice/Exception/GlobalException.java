package com.kousik.SpringBootPractice.Exception;

import java.sql.SQLClientInfoException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.dao.DataIntegrityViolationException;

//@ControllerAdvice
@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(NullPointerException.class)
	public String nullPointerException(){
		
		return"Null Pointer Exception Occured2";
		
		
	}
	
	
//	@ExceptionHandler(NullPointerException.class)
//	public ResponseEntity<?> nullPointerException(){
//				
//		APIResponce apr =new APIResponce(false,"Null Pointer Exception Occured");
//		return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(apr);
//		
//	}
	
//	@ExceptionHandler(CustomException.class)
//	public String customException(){
//		
//		return"CustomException Occured";
//		
//		
//	}
	
	// Handle custom exception
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleCustomException(CustomException ex) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT) // 409 for duplicate
                .body(ex.getMessage());
    }

    // Handle general exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Unexpected error: " + ex.getMessage());
    }
	
	
	
//	@ExceptionHandler(CustomException.class)
//	public String customException(CustomException ce){
//		
//		//return"CustomException Occured";
//		
//		return ce.getMessage();
//		
//	}
	
	

}
