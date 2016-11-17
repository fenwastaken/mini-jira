package models;

import java.sql.Timestamp;

public class TaskUser {

	String id;
	String idUser;
	String idTask;
	Timestamp date;
	
	public TaskUser(String id, String idUser, String idTask, Timestamp date) {
		super();
		this.id = id;
		this.idUser = idUser;
		this.idTask = idTask;
		this.date = date;
	}
	
}
