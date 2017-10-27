package com.slokam.Ravinder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.slokam.Ravinder.exception.DuplicateName;
import com.slokam.Ravinder.pojo.StudentPojo;

@Service
public class StudentMangoDBService implements IStudentService {

	@Override
	public StudentPojo getStudentById(Integer id) {
		
		return null;
	}

	@Override
	public void saveStudent(StudentPojo pojo) throws DuplicateName {
		
		
	}

	@Override
	public void saveStudents(List<StudentPojo> students) {
		
		
	}

	@Override
	public List<StudentPojo> getAllStudents() {
		
		return null;
	}

	@Override
	public void deleteStudentData(StudentPojo pojo) {
		
		
	}

}
