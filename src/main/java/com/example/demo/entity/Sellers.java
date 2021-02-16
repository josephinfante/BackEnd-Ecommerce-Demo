package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table (name = "sellers")
public class Sellers {
	
	@Id
	@Column (name = "sellersid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sellersid;
	
	@Column (name = "sellersname")
	private String sellersname;
	
	@Column (name = "sellersruc")
	private int sellersruc;
	
	@Column (name = "sellersemail")
	private String sellersemail;

	public int getSellersid() {
		return sellersid;
	}

	public void setSellersid(int sellersid) {
		this.sellersid = sellersid;
	}

	public String getSellersname() {
		return sellersname;
	}

	public void setSellersname(String sellersname) {
		this.sellersname = sellersname;
	}

	public int getSellersruc() {
		return sellersruc;
	}

	public void setSellersruc(int sellersruc) {
		this.sellersruc = sellersruc;
	}

	public String getSellersemail() {
		return sellersemail;
	}

	public void setSellersemail(String sellersemail) {
		this.sellersemail = sellersemail;
	}
	
}
