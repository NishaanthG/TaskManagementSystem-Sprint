package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Attachment")
public class Attachment {
	
	@Id
	private int attachmentID;
	
	private String fileName;
	
	private String filePath;
	
	@ManyToOne
	@JoinColumn(name = "TaskID")
	private Task task;

	public Attachment() {
	
	}

	public Attachment(int attachmentid, String fileName, String filePath, Task task) {
		super();
		this.attachmentID = attachmentid;
		this.fileName = fileName;
		this.filePath = filePath;
		this.task = task;
	}

	public int getAttachmentid() {
		return attachmentID;
	}

	public void setAttachmentid(int attachmentid) {
		this.attachmentID = attachmentid;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}
