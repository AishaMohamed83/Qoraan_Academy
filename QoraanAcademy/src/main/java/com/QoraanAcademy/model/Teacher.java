package com.QoraanAcademy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "teacher")
public class Teacher extends Person{
	@Id
	private String id;
	private int availableTimeFoSession;
	private int maximumNumberOfStudents;
	
	public Teacher(String firstName, String lasttName, int age, String email, String gander, int availableTimeFoSession,
			int maximumNumberOfStudents) {
		super(firstName, lasttName, age, email, gander);
		this.availableTimeFoSession = availableTimeFoSession;
		this.maximumNumberOfStudents = maximumNumberOfStudents;
	}

	public int getAvailableTimeFoSession() {
		return availableTimeFoSession;
	}

	public void setAvailableTimeFoSession(int availableTimeFoSession) {
		this.availableTimeFoSession = availableTimeFoSession;
	}

	public int getMaximumNumberOfStudents() {
		return maximumNumberOfStudents;
	}

	public void setMaximumNumberOfStudents(int maximumNumberOfStudents) {
		this.maximumNumberOfStudents = maximumNumberOfStudents;
	}
	
	
}
