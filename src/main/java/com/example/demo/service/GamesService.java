package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Games;

public interface GamesService {
	List<Games>list();
	Games listId (int gamesid);
	Games add (Games g);
	Games edit (Games g);
	Games delete (int gamesid);
}
