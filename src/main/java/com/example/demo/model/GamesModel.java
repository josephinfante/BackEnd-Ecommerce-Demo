package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Games;
import com.example.demo.repository.GamesRepository;
import com.example.demo.service.GamesService;

@Service
public class GamesModel implements GamesService{
	
	@Autowired
	private GamesRepository gamesRepository;

	@Override
	public List<Games> list() {
		return gamesRepository.findAll();
	}

	@Override
	public Games listId(int gamesid) {
		return gamesRepository.findById(gamesid);
	}

	@Override
	public Games add(Games g) {
		return gamesRepository.save(g);
	}

	@Override
	public Games edit(Games g) {
		return gamesRepository.save(g);
	}

	@Override
	public Games delete(int gamesid) {
		Games g = gamesRepository.findById(gamesid);
		if(g!=null) {
			gamesRepository.delete(g);
		}
		return g;
	}

}
