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

import com.example.demo.entity.Users;
import com.example.demo.service.UsersService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/users"})
public class UsersController {
	@Autowired
	UsersService usersService;
	
	@GetMapping
	public List<Users>list(){
		return usersService.list();
	}
	
	@PostMapping
	public Users add (@RequestBody Users u) {
		return usersService.add(u);
	}
	
	@GetMapping(path = {"/{usersid}"})
	public Users listId(@PathVariable("usersid")int usersid) {
		return usersService.listId(usersid);
	}
	
	@PutMapping(path = {"/{usersid}"})
	public Users edit(@RequestBody Users u,@PathVariable("usersid")int usersid) {
		u.setUsersid(usersid);
		return usersService.edit(u);
	}
	
	@DeleteMapping(path = {"/{usersid}"})
	public Users delete(@PathVariable("usersid")int usersid) {
		return usersService.delete(usersid);
	}
}
