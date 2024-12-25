package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Task;
import com.example.demo.Model.User;

public interface TaskRepository extends JpaRepository<Task, Integer>{
	
	public List<Task> findByUserAndStatus(User user , String status);
	
	public List<Task> findByPriorityAndStatus(String priority , String status);
	
	

}
