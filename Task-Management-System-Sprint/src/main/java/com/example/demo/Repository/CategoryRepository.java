package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
//	public Category findByCategoryid(int categoryid);
	
}
