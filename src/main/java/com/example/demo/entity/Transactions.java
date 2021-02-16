package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table (name = "transactions")
public class Transactions {
	
	@Id
	@Column (name = "transactionsid")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int transactionsid;
	
	@Column (name = "gamesid")
	private int gamesid;
	
	@Column (name = "usersid")
	private int usersid;
	
	@Column (name = "transactiondate")
	private String transactiondate;
	
	@Column (name = "transactionmethod")
	private String transactionmethod;
	
	@Column (name = "transactiontotal")
	private double transactiontotal;

	public int getTransactionsid() {
		return transactionsid;
	}

	public void setTransactionsid(int transactionsid) {
		this.transactionsid = transactionsid;
	}

	public int getGamesid() {
		return gamesid;
	}

	public void setGamesid(int gamesid) {
		this.gamesid = gamesid;
	}

	public int getUsersid() {
		return usersid;
	}

	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}

	public String getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}

	public String getTransactionmethod() {
		return transactionmethod;
	}

	public void setTransactionmethod(String transactionmethod) {
		this.transactionmethod = transactionmethod;
	}

	public double getTransactiontotal() {
		return transactiontotal;
	}

	public void setTransactiontotal(double transactiontotal) {
		this.transactiontotal = transactiontotal;
	}
	
}
