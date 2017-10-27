package com.slokam.Ravinder.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.slokam.Ravinder.Util.StringUtil;
import com.slokam.Ravinder.dao.StudentDao;
import com.slokam.Ravinder.exception.DuplicateName;
import com.slokam.Ravinder.pojo.StudentPojo;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentDao studentdao;
	
	@Autowired
	private StringUtil stringUtil;
	
	public StudentPojo getStudentById(Integer id){
		return	studentdao.findOne(id); 
		
	}
	
	public void saveStudent( StudentPojo pojo ) throws DuplicateName{
		List<StudentPojo> stdObj=studentdao.findByname(pojo.getName());
		if(stdObj.size()>0){
			throw new DuplicateName();
		}
		else
			studentdao.save(pojo);
	}
	
	
	public void saveStudents(List<StudentPojo> students){
		studentdao.save(students);
	}
	
	
	public List<StudentPojo> getAllStudents(){
		stringUtil.test();
		return 	studentdao.findAll();
		
		
	}
	
	public void deleteStudentData(StudentPojo pojo){
		studentdao.delete(pojo);
	}
	
}
