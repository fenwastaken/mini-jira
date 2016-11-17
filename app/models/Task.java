package models;

import java.sql.Timestamp;
import java.util.Date;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Task extends Model {

	
	public String name;
	public String content;
	public boolean urgent;
	
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP) 
	public Date creation;
	
	public int idProject;
	
	public Task() {
		super();
		this.creation = new Date();
	}
	
	public Task(String name, String content, boolean urgent, int idProject) {
		super();
		this.name = name;
		this.content = content;
		this.urgent = urgent;		
		this.creation = new Date();
		this.idProject = idProject;
	}
	
}
