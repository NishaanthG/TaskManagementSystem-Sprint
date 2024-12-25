package com.example.demo.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Notification")
public class Notification {
	@Id
	private int notificationID;
	
	private String text;
	
	private LocalDateTime createdAt;
	
	@ManyToOne
	@JoinColumn(name = "UserID")
	private User user;

	public Notification() {
		
	}

	public Notification(int notificationid, String text, LocalDateTime createdAt, User user) {
		this.notificationID = notificationid;
		this.text = text;
		this.createdAt = createdAt;
		this.user = user;
	}

	public int getNotificationid() {
		return notificationID;
	}

	public void setNotificationid(int notificationid) {
		this.notificationID = notificationid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
