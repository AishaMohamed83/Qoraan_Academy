package com.QoraanAcademy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studend")
public class Student extends Person{
	@Id
	private String id;
	private int tajweedLevel;
	private int partsOfQoraan;
	private int missedSessions;
	private int sessionsPerWeek;
	
	public Student(String firstName, String lasttName, int age, String email, String gander, int tajweedLevel,
			int partsOfQoraan, int missedSessions, int sessionsPerWeek) {
		super(firstName, lasttName, age, email, gander);
		this.tajweedLevel = tajweedLevel;
		this.partsOfQoraan = partsOfQoraan;
		this.missedSessions = missedSessions;
		this.sessionsPerWeek = sessionsPerWeek;
	}
	
	public int getTajweedLevel() {
		return tajweedLevel;
	}
	public void setTajweedLevel(int tajweedLevel) {
		this.tajweedLevel = tajweedLevel;
	}
	public int getPartsOfQoraan() {
		return partsOfQoraan;
	}
	public void setPartsOfQoraan(int partsOfQoraan) {
		this.partsOfQoraan = partsOfQoraan;
	}
	public int getMissedSessions() {
		return missedSessions;
	}
	public void setMissedSessions(int missedSessions) {
		this.missedSessions = missedSessions;
	}
	public int getSessionsPerWeek() {
		return sessionsPerWeek;
	}
	public void setSessionsPerWeek(int sessionsPerWeek) {
		this.sessionsPerWeek = sessionsPerWeek;
	}
	
	
	
}
