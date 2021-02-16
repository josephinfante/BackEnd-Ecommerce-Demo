package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Transactions;

public interface TransactionsService {
	List<Transactions>list();
	Transactions listId(int transactionsid);
	Transactions add (Transactions t);
	Transactions edit (Transactions t);
	Transactions delete (int transactionsid);
}
