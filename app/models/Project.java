package models;

import java.sql.Timestamp;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Project extends Model {

	//id
	String name;
	Timestamp creation;
	
	
	public Project(String name, Timestamp creation) {
		super();
		this.name = name;
		this.creation = new Timestamp(System.currentTimeMillis());
	}
	
	
	
}
