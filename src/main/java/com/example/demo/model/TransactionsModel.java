package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Transactions;
import com.example.demo.repository.TransactionsRepository;
import com.example.demo.service.TransactionsService;

@Service
public class TransactionsModel implements TransactionsService{

	@Autowired
	private TransactionsRepository transactionsRepository;
	
	@Override
	public List<Transactions> list() {
		return transactionsRepository.findAll();
	}

	@Override
	public Transactions listId(int transactionsid) {
		return transactionsRepository.findById(transactionsid);
	}

	@Override
	public Transactions add(Transactions t) {
		return transactionsRepository.save(t);
	}

	@Override
	public Transactions edit(Transactions t) {
		return transactionsRepository.save(t);
	}

	@Override
	public Transactions delete(int transactionsid) {
		Transactions t = transactionsRepository.findById(transactionsid);
		if (t!=null) {
			transactionsRepository.delete(t);
		}
		return t;
	}

}
