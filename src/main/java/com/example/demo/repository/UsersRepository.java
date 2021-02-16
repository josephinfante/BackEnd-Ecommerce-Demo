package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.entity.Users;

public interface UsersRepository extends Repository<Users, Integer>{
	List<Users>findAll();
	Users findById (int usersid);
	Users save (Users u);
	void delete (Users u);
}
