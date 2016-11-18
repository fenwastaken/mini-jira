package models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import play.db.jpa.Model;

@Entity
public class Project extends Model {

	public String name;
	public String description;

	@Column(columnDefinition="DATETIME")
	public Date creation;
	
	public Project(){
		super();
		this.name = "Premier projet";
		this.description = "Pas de description";
		this.creation = new Date();

	}
	public Project(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		this.creation = new Date();
	}
	
	
	
}
