package com.example.demo.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TaskCategory")
public class TaskCategory {

	@EmbeddedId
	private TaskCategoryID id;
	
	@ManyToOne
	@JoinColumn(name = "taskID" , insertable=false, updatable=false )
	private Task task;
	
	@ManyToOne
	@JoinColumn(name = "categoryID" , insertable=false, updatable=false)
	private Category category;

	public TaskCategory(TaskCategoryID id, Task task, Category category) {
		this.id = id;
		this.task = task;
		this.category = category;
	}

	public TaskCategory() {
		super();
	}

	public TaskCategoryID getId() {
		return id;
	}

	public void setId(TaskCategoryID id) {
		this.id = id;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
