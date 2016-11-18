package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Status extends Model{
	
	String name;
	
	
	public Status(String name) {
		super();
		this.name = name;
	}	
	
	
	
}
