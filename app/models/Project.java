package models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Project extends Model {

	//id
	public String name;
	public String description;
	public Date creation;

	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
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
