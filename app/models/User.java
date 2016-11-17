package models;

import play.db.jpa.Model;

import java.util.UUID;

public class User extends Model{

	public String name;

	public User(){}

	public User(String name) {
		super();
		this.name = name;
	}
	
}
