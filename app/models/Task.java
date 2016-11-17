package models;

import java.sql.Timestamp;
import java.util.UUID;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Task extends Model {

	String id;
	public String name;
	public String content;
	public boolean urgent;
	Timestamp creation;
	
	public Task() {
		super();
		this.id = UUID.randomUUID().toString();
	}
	
	public Task(String name, String content, boolean urgent, Timestamp creation) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.content = content;
		this.urgent = urgent;
		this.creation = creation;
	}
	
}
