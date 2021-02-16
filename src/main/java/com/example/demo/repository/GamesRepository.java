package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.entity.Games;

public interface GamesRepository extends Repository<Games, Integer>{
	List<Games>findAll();
	Games findById (int gamesid);
	Games save (Games g);
	void delete (Games g);
}
