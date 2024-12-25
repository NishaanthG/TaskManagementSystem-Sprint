package com.example.demo.Model;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	
	@Id
	private int userID;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private String fullname;
	
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
	private List<Project> projects;
	
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
	private List<Task> tasks;
	
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
	private List<Comment> comments;
	
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
	private List<Notification> notifications;
	
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
	private List<UserRoles> userroles;

	public User(int userID, String username, String password, String email, String fullname, List<Project> projects,
			List<Task> tasks, List<Comment> comments, List<Notification> notifications, List<UserRoles> userroles) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.email = email;
		this.fullname = fullname;
		this.projects = projects;
		this.tasks = tasks;
		this.comments = comments;
		this.notifications = notifications;
		this.userroles = userroles;
	}

	public User() {
		super();
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public List<UserRoles> getUserroles() {
		return userroles;
	}

	public void setUserroles(List<UserRoles> userroles) {
		this.userroles = userroles;
	}
	
}
	
	