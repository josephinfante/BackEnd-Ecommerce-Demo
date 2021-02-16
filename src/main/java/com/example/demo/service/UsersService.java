package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Users;

public interface UsersService {
	List<Users>list();
	Users listId(int usersid);
	Users add (Users u);
	Users edit (Users u);
	Users delete (int usersid);
}
