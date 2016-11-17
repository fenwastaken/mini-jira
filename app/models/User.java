package models;

import java.util.UUID;

public class User {

	String id;
	String name;
	
	public User(String name) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}
	
}
