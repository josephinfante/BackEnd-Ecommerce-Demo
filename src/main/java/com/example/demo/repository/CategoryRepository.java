package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.entity.Category;

public interface CategoryRepository extends Repository<Category, Integer>{
	List<Category>findAll();
	Category findById (int categoryid);
	Category save (Category c);
	void delete(Category c);
}
