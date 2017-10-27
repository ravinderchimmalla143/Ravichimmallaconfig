package com.slokam.Ravinder.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Ravinder.exception.DuplicateName;
import com.slokam.Ravinder.pojo.StudentPojo;
import com.slokam.Ravinder.service.IStudentService;
import com.slokam.Ravinder.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
Logger logger=Logger.getLogger(StudentController.class);
	@Autowired
	@Qualifier("studentService")
	private IStudentService studentservice;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<StudentPojo> getStudentById(Integer id) throws Exception{
		ResponseEntity<StudentPojo> responseEntity=null;
		/*if(true)
			throw new Exception();*/
		        
		        logger.trace(" TRACE*******The method is starting ........+getStudentById()");
		        logger.debug(" DEBUG*******The method is starting ........+getStudentById()");
		        logger.info("  INFO*********The method is starting ........+getStudentById()");
		        logger.warn("  WARN********The method is starting ........+getStudentById()");
		        logger.error(" ERROR*******The method is starting ........+getStudentById()");
		        logger.fatal(" FATAL********The method is starting ........+getStudentById()");
		        StudentPojo std=studentservice.getStudentById(id);
				logger.debug("The student id ........"+id);
				if(std!=null){
				logger.debug("The method is Ending ........+getStudentById()");
				
				 responseEntity=new ResponseEntity<StudentPojo>(std,HttpStatus.OK);
				}
				else{
				logger.debug("The Requested studentid is not available in DataBase ........");
				 responseEntity=new ResponseEntity<StudentPojo>(HttpStatus.NOT_FOUND);
				 
				}
				return responseEntity;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<StudentPojo> saveStudent(@Valid @RequestBody StudentPojo pojo,BindingResult result) throws DuplicateName
	 {
		ResponseEntity<StudentPojo> responseentity=null;
	 
		if(result.hasErrors()){
			List<ObjectError> errors=result.getAllErrors();
			List<String> errorsList=new ArrayList<>();
			
			for (ObjectError objectError : errors) {
				errorsList.add(objectError.getDefaultMessage());
				responseentity=new ResponseEntity<StudentPojo>((StudentPojo) errorsList,HttpStatus.BAD_REQUEST);
			  }
			
		}
			studentservice.saveStudent(pojo);
			return responseentity=new ResponseEntity<StudentPojo>(HttpStatus.OK);
		}
	
	
	@RequestMapping(value="/all",method=RequestMethod.POST)
	public void saveStudents(@RequestBody List<StudentPojo> students)
	{
		studentservice.saveStudents(students);
		
	}
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<StudentPojo> getAllStudents( ) throws IOException{
		/*if(true)
			throw new IOException();*/
		return studentservice.getAllStudents();
		
	}
	@RequestMapping(method=RequestMethod.DELETE)
	 public void deleteStudentData(StudentPojo pojo){
		studentservice.deleteStudentData(pojo);
	 }
	
	
}
