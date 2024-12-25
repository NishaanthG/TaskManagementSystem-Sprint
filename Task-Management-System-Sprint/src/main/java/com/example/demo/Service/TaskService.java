package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Task;
import com.example.demo.Model.User;

public interface TaskService {
	
	public List<Task> getTasksByPriorityAndStatus(String priority , String status);
	
	public List<Task> getTasksByUserAndStatus(User u , String Status);
	
	

}
