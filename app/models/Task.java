package models;

import java.sql.Timestamp;
import java.util.UUID;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Task extends Model {

	public String name;
	public String content;
	public boolean urgent;
	public Timestamp creation;
	
	public Task() {
		super();
	}
	
	public Task(String name, String content, boolean urgent) {
		super();
		this.name = name;
		this.content = content;
		this.urgent = urgent;		
		this.creation = new Timestamp(System.currentTimeMillis());
	}
	
}
