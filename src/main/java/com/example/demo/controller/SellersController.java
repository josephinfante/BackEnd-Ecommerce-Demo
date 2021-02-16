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

import com.example.demo.entity.Sellers;
import com.example.demo.service.SellersService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/sellers"})
public class SellersController {
	@Autowired
	SellersService sellersService;
	
	@GetMapping
	public List<Sellers> list() {
		return sellersService.list();
	}
	
	@PostMapping
	public Sellers add(@RequestBody Sellers s) {
		return sellersService.add(s);
	}
	
	@GetMapping(path = {"/{sellersid}"})
	public Sellers listId(@PathVariable("sellersid")int sellersid) {
		return sellersService.listId(sellersid);
	}
	
	@PutMapping(path = {"/{sellersid}"})
	public Sellers edit(@RequestBody Sellers s,@PathVariable("sellersid")int sellersid) {
		s.setSellersid(sellersid);
		return sellersService.edit(s);
	}
	
	@DeleteMapping(path = {"/{sellersid}"})
	public Sellers delete(@PathVariable("sellersid")int sellersid) {
		return sellersService.delete(sellersid);
	}

}
