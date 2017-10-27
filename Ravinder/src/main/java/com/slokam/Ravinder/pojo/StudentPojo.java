package com.slokam.Ravinder.pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="student")
public class StudentPojo {
 
 @Id
 @GeneratedValue
 private Integer id;
 
 @NotBlank
 @Size(min = 1, max = 20)
 private String name;
 
 /*@Length(min=12,max=40)*/
 private Integer age;
 @Email(regexp="^[A-Z a-z][A-Z a-z 0-9]{5,20}@[A-Z a-z]{2,8}\\.[A-Z a-z]{2,8}$")//for mail
 private String qual;
 private Long phone;
 public StudentPojo(){
	 
 }
 
public StudentPojo(Integer id, String name, Integer age, String qual, Long phone) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.qual = qual;
	this.phone = phone;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getQual() {
	return qual;
}
public void setQual(String qual) {
	this.qual = qual;
}
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}
 
}
