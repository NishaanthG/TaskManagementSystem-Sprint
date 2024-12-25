package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
	
	@Id
	private int categoryID;
	
	private String categoryName;

	@OneToMany(mappedBy = "category" , cascade = CascadeType.ALL)
	private List<TaskCategory> taskCategories;
	
	public Category(int categoryid, String categoryName, List<TaskCategory> taskCategories) {
		super();
		this.categoryID = categoryid;
		this.categoryName = categoryName;
		this.taskCategories = taskCategories;
	}

	public Category() {

	}

	public int getCategoryid() {
		return categoryID;
	}

	public void setCategoryid(int categoryid) {
		this.categoryID = categoryid;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<TaskCategory> getTaskCategories() {
		return taskCategories;
	}

	public void setTaskCategories(List<TaskCategory> taskCategories) {
		this.taskCategories = taskCategories;
	}
	
}