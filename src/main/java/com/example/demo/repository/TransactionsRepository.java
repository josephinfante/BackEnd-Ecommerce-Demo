package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.entity.Transactions;

public interface TransactionsRepository extends Repository<Transactions, Integer>{
	List<Transactions>findAll();
	Transactions findById (int transactionsid);
	Transactions save (Transactions t);
	void delete (Transactions t);
}
