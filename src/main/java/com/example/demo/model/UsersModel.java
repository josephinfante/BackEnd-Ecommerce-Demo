package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;
import com.example.demo.service.UsersService;

@Service
public class UsersModel implements UsersService{

	@Autowired
	private UsersRepository usersRepository;

	@Override
	public List<Users> list() {
		return usersRepository.findAll();
	}

	@Override
	public Users listId(int usersid) {
		return usersRepository.findById(usersid);
	}

	@Override
	public Users add(Users u) {
		return usersRepository.save(u);
	}

	@Override
	public Users edit(Users u) {
		return usersRepository.save(u);
	}

	@Override
	public Users delete(int usersid) {
		Users u = usersRepository.findById(usersid);
		if (u!=null) {
			usersRepository.delete(u);
		}
		return u;
	}

}
