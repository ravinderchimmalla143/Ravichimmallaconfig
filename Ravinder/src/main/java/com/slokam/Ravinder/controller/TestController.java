package com.slokam.Ravinder.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Ravinder.pojo.StudentPojo;

@RestController
public class TestController {
    @RequestMapping("/get")
	public String getData(){
	return "hello java Sathya";
	 
 }
    @RequestMapping("getarraydata")
    public String[] getarrayData(){
    	String[] str={"ram","rahul","sita"};
		return str;
    	
    }
    
    @RequestMapping("getstudentdata")
    public StudentPojo getStudentData(){
    	StudentPojo pojo=new StudentPojo(1,"rama",21,"btech",1234L);
		return pojo;
    }
    
    @RequestMapping("getstudentsdata")
    public List<StudentPojo>getStudentsData(){
    	StudentPojo pojo1=new StudentPojo(1,"rama",21,"btech",1234L);
    	StudentPojo pojo2=new StudentPojo(2,"ranjith",26,"mtech",1274L);
    	StudentPojo pojo3=new StudentPojo(3,"ramasri",23,"msc",1134L);
    	List<StudentPojo> studentslist=new ArrayList<StudentPojo>();
    	studentslist.add(pojo1);
    	studentslist.add(pojo2);
    	studentslist.add(pojo3);
		return studentslist;
    }
    @RequestMapping("getmapdata")
    public Map<Integer, StudentPojo> getstudentsMapData(){
    	StudentPojo pojo1=new StudentPojo(1,"rama",21,"btech",1234L);
    	StudentPojo pojo2=new StudentPojo(2,"ranjith",26,"mtech",1274L);
    	StudentPojo pojo3=new StudentPojo(3,"ramasri",23,"msc",1134L);
    	Map<Integer,StudentPojo> students=new HashMap<>();
    	students.put(1, pojo1);
    	students.put(2, pojo2);
    	students.put(3, pojo3);
		return students;
    }
}
