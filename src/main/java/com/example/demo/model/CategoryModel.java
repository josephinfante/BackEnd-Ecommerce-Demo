package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;

@Service
public class CategoryModel implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> list() {
		return categoryRepository.findAll();
	}

	@Override
	public Category listId(int categoryid) {
		return categoryRepository.findById(categoryid);
	}

	@Override
	public Category add(Category c) {
		return categoryRepository.save(c);
	}

	@Override
	public Category edit(Category c) {
		return categoryRepository.save(c);
	}

	@Override
	public Category delete(int categoryid) {
		 Category c = categoryRepository.findById(categoryid);
		 if(c!=null) {
			 categoryRepository.delete(c);
		 }
		 return c;
	}

}
