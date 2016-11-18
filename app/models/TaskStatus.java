package models;

import play.db.jpa.Model;

import javax.persistence.OneToOne;
import java.sql.Timestamp;
import java.util.UUID;

public class TaskStatus extends Model{

	@OneToOne
	public Task task;
	@OneToOne
	public Status status;
	Timestamp date;

	public TaskStatus(Task task, Status status) {
		super();
		this.status = status;
		this.task = task;
		this.date = new Timestamp(System.currentTimeMillis());
	}
	
}
