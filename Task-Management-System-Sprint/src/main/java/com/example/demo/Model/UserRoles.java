package com.example.demo.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserRoles")
public class UserRoles {
	
	@EmbeddedId
	private UserRolesID userrolesID;
	
	@ManyToOne
	@JoinColumn(name = "userID" , insertable=false, updatable=false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "userRoleID" , insertable=false, updatable=false)
	private UserRole userRole;

	public UserRoles(UserRolesID id, User user, UserRole userRole) {
		this.userrolesID = id;
		this.user = user;
		this.userRole = userRole;
	}

	public UserRoles() {
		super();
	}

	public UserRolesID getId() {
		return userrolesID;
	}

	public void setId(UserRolesID id) {
		this.userrolesID = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

}
