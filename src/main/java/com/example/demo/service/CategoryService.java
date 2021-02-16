package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Category;

public interface CategoryService {
	List<Category>list();
	Category listId (int categoryid);
	Category add (Category c);
	Category edit (Category c);
	Category delete (int categoryid);
}
