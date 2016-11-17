package models;

import java.sql.Timestamp;
import java.util.UUID;

public class TaskUser {

	String id;
	String idUser;
	String idTask;
	Timestamp date;
	
	public TaskUser(String idUser, String idTask, Timestamp date) {
		super();
		this.idUser = idUser;
		this.idTask = idTask;
		this.date = new Timestamp(System.currentTimeMillis());
	}
	
}
