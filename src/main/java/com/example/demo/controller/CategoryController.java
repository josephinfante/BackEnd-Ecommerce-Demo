package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/category"})
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping
	public List<Category>list(){
		return categoryService.list();
	}
	
	@PostMapping
	public Category add(@RequestBody Category c) {
		return categoryService.add(c);
	}
	
	@GetMapping(path = {"/{categoryid}"})
	public Category listId(@PathVariable("categoryid")int categoryid) {
		return categoryService.listId(categoryid);
	}
	
	@PutMapping(path = {"/{categoryid}"})
	public Category edit(@RequestBody Category c,@PathVariable("categoryid") int categoryid) {
		c.setCategoryid(categoryid);
		return categoryService.edit(c);
	}
	
	@DeleteMapping(path = {"/{categoryid}"})
	public Category delete(@PathVariable("categoryid") int categoryid) {
		return categoryService.delete(categoryid);
	}
}
