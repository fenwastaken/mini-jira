package models;

import java.sql.Timestamp;

public class Task {

	String id;
	String name;
	String content;
	boolean urgent;
	Timestamp creation;
	
	public Task(String id) {
		super();
		this.id = id;
	}
	
	public Task(String id, String name, String content, boolean urgent, Timestamp creation) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.urgent = urgent;
		this.creation = creation;
	}
	
}
