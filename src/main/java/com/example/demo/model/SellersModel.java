package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Sellers;
import com.example.demo.repository.SellersRepository;
import com.example.demo.service.SellersService;

@Service
public class SellersModel implements SellersService{

	@Autowired
	private SellersRepository sellersRepository;
	
	@Override
	public List<Sellers> list() {
		return sellersRepository.findAll();
	}

	@Override
	public Sellers listId(int sellersid) {
		return sellersRepository.findById(sellersid);
	}

	@Override
	public Sellers add(Sellers s) {
		return sellersRepository.save(s);
	}

	@Override
	public Sellers edit(Sellers s) {
		return sellersRepository.save(s);
	}

	@Override
	public Sellers delete(int sellersid) {
		Sellers s = sellersRepository.findById(sellersid);
		if(s!=null) {
			sellersRepository.delete(s);
		}
		return s;
	}

}
