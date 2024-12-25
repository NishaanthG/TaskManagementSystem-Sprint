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
@Table(name = "UserRole")
public class UserRole {
	
	@Id
	private int userRoleID;
	
	private String roleName;
	
	@OneToMany(mappedBy = "userRole" , cascade = CascadeType.ALL)
	private List<UserRoles> userRoles;

	public UserRole(int userRoleID, String roleName, List<UserRoles> userRoles) {
		super();
		this.userRoleID = userRoleID;
		this.roleName = roleName;
		this.userRoles = userRoles;
	}

	public UserRole() {
		super();
	}

	public int getUserRoleID() {
		return userRoleID;
	}

	public void setUserRoleID(int userRoleID) {
		this.userRoleID = userRoleID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}

}