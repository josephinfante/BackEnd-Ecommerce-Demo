package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Sellers;

public interface SellersService {
	List<Sellers>list();
	Sellers listId (int sellersid);
	Sellers add (Sellers s);
	Sellers edit (Sellers s);
	Sellers delete (int sellersid);
}
