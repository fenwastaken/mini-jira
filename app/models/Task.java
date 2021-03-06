package models;

import play.db.jpa.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Task extends Model {

	@OneToOne
	public User user;

	public String name;
	public String content;
	public boolean urgent;
	
	@Column(columnDefinition="DATETIME")
	public Date creation;

	@OneToOne
	public Project project;

	@OneToOne(cascade = {CascadeType.ALL})
	public TaskStatus taskStatus;
	
	public Task() {
		super();
		this.creation = new Date();
//        List<Project> listProjects = new ArrayList<Project>();
//        listProjects = Project.findAll();
//        if (listProjects == null || listProjects.isEmpty()){
//            project = new Project();
//        }
	}
	
	public Task(String name, String content, boolean urgent, Project project) {
		super();
		this.name = name;
		this.content = content;
		this.urgent = urgent;		
		this.creation = new Date();
		this.project = project;
	}
	
}
