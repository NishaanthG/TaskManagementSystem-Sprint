package com.example.demo.Model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class TaskCategoryID implements Serializable{
	
	private Integer taskID;
	
	private Integer categoryID;
	
	public TaskCategoryID(int task, int category) {
		this.taskID = task;
		this.categoryID = category;
	}

	public TaskCategoryID() {
		
	}

	public int getTask() {
		return taskID;
	}

	public void setTask(int task) {
		this.taskID = task;
	}

	public int getCategory() {
		return categoryID;
	}

	public void setCategory(int category) {
		this.categoryID = category;
	}

}
