package com.slokam.Ravinder.exception;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.slokam.Ravinder.pojo.StudentPojo;

@ControllerAdvice
public class OurExceptionHandler {
		
	    @ExceptionHandler(DuplicateName.class)
		public ResponseEntity<StudentPojo> handleException(){
			ResponseEntity<StudentPojo> responseentity=new ResponseEntity<StudentPojo>(HttpStatus.CONFLICT);
			return responseentity;
		}
	   
	   @ExceptionHandler(IOException.class)
		public ResponseEntity<StudentPojo> handleIOException(){
		   System.out.println("Am in IOException.................");
			ResponseEntity<StudentPojo> responseentity=new ResponseEntity<StudentPojo>(HttpStatus.CONFLICT);
			return responseentity;
		}
	   @ExceptionHandler(Exception.class)
		public ResponseEntity<StudentPojo> handlemainException(){
		   System.out.println("Am in Exception.................");
			ResponseEntity<StudentPojo> responseentity=new ResponseEntity<StudentPojo>(HttpStatus.CONFLICT);
			return responseentity;
		}

}
