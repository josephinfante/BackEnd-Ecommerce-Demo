package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.entity.Sellers;

public interface SellersRepository extends Repository<Sellers, Integer>{
	List<Sellers>findAll();
	Sellers findById (int sellersid);
	Sellers save(Sellers s);
	void delete (Sellers s);
}
