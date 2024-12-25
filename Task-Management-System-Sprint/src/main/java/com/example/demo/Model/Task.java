package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Task")
public class Task {
	
	@Id
	private int taskID;
	private String taskName;
	private String description;
	private Date dueDate;
	private String priority;
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "projectID")
	private Project project;
	
	@ManyToOne
	@JoinColumn(name = "userID")
	private User user;
	
	@OneToMany(mappedBy = "task" , cascade = CascadeType.ALL)
	private List<Comment> comments;
	
	@OneToMany(mappedBy = "task" , cascade = CascadeType.ALL)
	private List<Attachment> attachments;
	
	@OneToMany(mappedBy = "task" , cascade = CascadeType.ALL)
	private List<TaskCategory> taskCategories;

	public Task(int taskID, String taskName, String description, Date dueDate, String priority, String status,
			Project project, User user, List<Comment> comments, List<Attachment> attachments,
			List<TaskCategory> taskCategories) {
		super();
		this.taskID = taskID;
		this.taskName = taskName;
		this.description = description;
		this.dueDate = dueDate;
		this.priority = priority;
		this.status = status;
		this.project = project;
		this.user = user;
		this.comments = comments;
		this.attachments = attachments;
		this.taskCategories = taskCategories;
	}

	public Task() {
		
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public List<TaskCategory> getTaskCategories() {
		return taskCategories;
	}

	public void setTaskCategories(List<TaskCategory> taskCategories) {
		this.taskCategories = taskCategories;
	}
	
}
