package com.example.demo.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.DeleteFailsException;
import com.example.demo.Exception.GetFailsException;
import com.example.demo.Model.Category;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Service.CategoryService;

@Service
public class CategoryServiceImplementation implements CategoryService {
	
	@Autowired
	private CategoryRepository cr;

	@Override
	public Category getCategoryByID(int CategoryId) 
	{
		Optional<Category> c = cr.findById(CategoryId);
		
		if (c.isPresent()) {
			Category c1 = c.get();
			return c1;
		}
		else {
			throw new GetFailsException("GETFAILS", "Category doesn't exist");
		}
	}

	@Override
	public List<Category> getAllCategories() {
		
		List<Category> lc = cr.findAll();
		
		if (lc.isEmpty()) {
			 throw new GetFailsException("GETFAILS", "Category list is empty");
		}
		else {
			return lc;
		}
	}

	@Override
	public void DeleteCategoryById(int CategoryId) {
		
		Optional<Category> oc = cr.findById(CategoryId);
		if (oc.isEmpty()) {
			throw new DeleteFailsException("DLTFAILS","Category doesn't Exist");
		}
		
	}

}
