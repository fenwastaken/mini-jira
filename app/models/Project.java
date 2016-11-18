package models;

import java.sql.Timestamp;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Project extends Model {

	//id
	public String name;
	public String description;
	public Timestamp creation;
	
	
	public Project(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		this.creation = new Timestamp(System.currentTimeMillis());
	}
	
	
	
}
