package models;

import java.sql.Timestamp;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Task extends Model {

	@OneToOne
	public User user;

	public String name;
	public String content;
	public boolean urgent;
	public Timestamp creation;
	public int idProject;
	
	public Task() {
		super();
	}
	
	public Task(String name, String content, boolean urgent, int idProject) {
		super();
		this.name = name;
		this.content = content;
		this.urgent = urgent;		
		this.creation = new Timestamp(System.currentTimeMillis());
		this.idProject = idProject;
	}
	
}
