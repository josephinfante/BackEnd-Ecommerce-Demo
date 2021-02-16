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

import com.example.demo.entity.Transactions;
import com.example.demo.service.TransactionsService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/transactions"})
public class TransactionsController {
	@Autowired
	TransactionsService transactionsService;
	
	@GetMapping
	public List<Transactions>list() {
		return transactionsService.list();
	}
	
	@PostMapping
	public Transactions add (@RequestBody Transactions t) {
		return transactionsService.add(t);
	}
	
	@GetMapping(path = {"/{transactionsid}"})
	public Transactions listId (@PathVariable("transactionsid")int transactionsid) {
		return transactionsService.listId(transactionsid);
	}
	
	@PutMapping(path = {"/{transactionsid}"})
	public Transactions edit (@RequestBody Transactions t,@PathVariable("transactionsid")int transactionsid) {
		t.setTransactionsid(transactionsid);
		return transactionsService.edit(t);
	}
	
	@DeleteMapping(path = {"/{transactionsid}"})
	public Transactions delete (@PathVariable("transactionsid")int transactionsid) {
		return transactionsService.delete(transactionsid);
	}
}
