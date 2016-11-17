package models;

import java.sql.Timestamp;
import java.util.UUID;

public class TaskStatus {

	String idTask;
	String idStatus;
	Timestamp date;
	
	public TaskStatus(String idTask, String idStatus) {
		super();
		this.idTask = idTask;
		this.idStatus = idStatus;
		this.date = new Timestamp(System.currentTimeMillis());
	}
	
}
