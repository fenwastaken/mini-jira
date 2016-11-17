package models;

import java.util.UUID;

public class Status {
	
	String id;
	String name;
	
	
	public Status(String name) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}	
	
	
	
}
