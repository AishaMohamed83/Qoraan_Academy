package com.QoraanAcademy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "session")
public class Session {
	@Id
	private String id;
	private int attendedSessions;

	public Session(int attendedSessions) {
		super();
		this.attendedSessions = attendedSessions;
	}
	
//	public boolean attendance()  {}
//	
//	public string linkOfSessions() {}
}
