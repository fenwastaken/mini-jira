package models;

import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public class TaskStatus extends Model{

	@OneToOne
	public Task task;
	@OneToOne
	public Status status;

	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	public Date creation;

	public TaskStatus(Task task, Status status) {
		super();
		this.status = status;
		this.task = task;
		this.creation = new Date();
	}
	
}
