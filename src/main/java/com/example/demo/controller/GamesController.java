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

import com.example.demo.entity.Games;
import com.example.demo.service.GamesService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/games"})
public class GamesController {
	
	@Autowired
	GamesService gamesService;
	
	@GetMapping
	public List<Games>list(){
		return gamesService.list();
	}
	
	@PostMapping
	public Games add(@RequestBody Games g) {
		return gamesService.add(g);
	}
	
	@GetMapping(path = {"/{gamesid}"})
	public Games listId(@PathVariable("gamesid")int gamesid) {
		return gamesService.listId(gamesid);
	}
	
	@PutMapping(path = {"/{gamesid}"})
	public Games edit(@RequestBody Games g,@PathVariable("gamesid")int gamesid) {
		g.setGamesid(gamesid);
		return gamesService.edit(g);
	}
	
	@DeleteMapping(path = {"/{gamesid}"})
	public Games delete(@PathVariable("gamesid")int gamesid) {
		return gamesService.delete(gamesid);
	}
}
