package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Category;

public interface CategoryService {
	
	public Category getCategoryByID(int CategoryId);
	
	public List<Category> getAllCategories();
	
	public void DeleteCategoryById(int CategoryId);
 
}
