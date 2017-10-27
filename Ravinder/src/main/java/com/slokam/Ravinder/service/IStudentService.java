package com.slokam.Ravinder.service;

import java.util.List;

import com.slokam.Ravinder.exception.DuplicateName;
import com.slokam.Ravinder.pojo.StudentPojo;

public interface IStudentService {
	
	public StudentPojo getStudentById(Integer id);
	public void saveStudent( StudentPojo pojo ) throws DuplicateName;
	public void saveStudents(List<StudentPojo> students);
	public List<StudentPojo> getAllStudents();
	public void deleteStudentData(StudentPojo pojo);
	
	
}
