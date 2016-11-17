package models;

import java.sql.Timestamp;

public class TaskStatus {

	String id;
	String idTask;
	String idStatus;
	Timestamp date;
	
	public TaskStatus(String id, String idTask, String idStatus) {
		super();
		this.id = id;
		this.idTask = idTask;
		this.idStatus = idStatus;
	}
	
}
