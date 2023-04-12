package com.QoraanAcademy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin")
public class Admin extends Person{
	
	@Id
	private String id;
	public void addStudent(){}
	public void addTeacher(){}
	public void deleteStudent(){}
	public void deleteTeacher(){}
//	public String searchStudent(){}
//	public String searchTeacher(){}
}
