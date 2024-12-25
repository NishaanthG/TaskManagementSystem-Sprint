package com.example.demo.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.GetFailsException;
import com.example.demo.Model.Task;
import com.example.demo.Model.User;
import com.example.demo.Repository.TaskRepository;
import com.example.demo.Service.TaskService;

@Service
public class TaskServiceImplementation implements TaskService{
	
	@Autowired
	private TaskRepository tr;

	@Override
	public List<Task> getTasksByPriorityAndStatus(String priority, String status) {
		
		List<Task> lt = tr.findByPriorityAndStatus(priority, status);
	
		if (lt.isEmpty()) {
			throw new GetFailsException("GETALLFAILS" , "Task list is empty");
		}
		else {
			return lt;
		}
	}

	@Override
	public List<Task> getTasksByUserAndStatus(User u, String Status) {
		
		List<Task> lt = tr.findByUserAndStatus(u, Status);
		
		if (lt.isEmpty()) {
			throw new GetFailsException("GETALLFAILS", "Task list is empty");
		}
		else {
			return lt;
		}
	}
	
	

}