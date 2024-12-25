package com.example.demo.Model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class UserRolesID implements Serializable{
	
	private int userID;
	
	private int userRoleID;

	public UserRolesID() {
		
	}

	public UserRolesID(int userID, int userroleID) {
		this.userID = userID;
		this.userRoleID = userroleID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getUserroleID() {
		return userRoleID;
	}

	public void setUserroleID(int userroleID) {
		this.userRoleID = userroleID;
	}
	
	

}
