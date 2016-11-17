package models;

import java.sql.Timestamp;

public class Project {

	//id
	String name;
	Timestamp creation;
	
	
	public Project(String name, Timestamp creation) {
		super();
		this.name = name;
		this.creation = new Timestamp(System.currentTimeMillis());
	}
	
	
	
}
