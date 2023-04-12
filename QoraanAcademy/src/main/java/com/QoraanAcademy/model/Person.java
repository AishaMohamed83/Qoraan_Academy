package com.QoraanAcademy.model;

public abstract class Person {
	
	private String firstName;
	private String lasttName;
	private int age;
	private String email;
	private String gander;
	
	public Person(String firstName, String lasttName, int age, String email, String gander) {
		super();
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.age = age;
		this.email = email;
		this.gander = gander;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGander() {
		return gander;
	}
	public void setGander(String gander) {
		this.gander = gander;
	}
		
	//public void logout() {};
}
