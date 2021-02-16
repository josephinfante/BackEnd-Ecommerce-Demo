package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table (name = "games")
public class Games {

	@Id
	@Column (name = "gamesid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gamesid;
	
	@Column(name = "gamesname")
	private String gamesname;
	
	@Column(name = "gamesnickname")
	private String gamesnickname;
	
	@Column(name = "gamesdescription")
	private String gamesdescription;
	
	@Column(name = "sellersid")
	private int sellersid;
	
	@Column(name = "categoryid")
	private int categoryid;
	
	@Column(name = "gamesbuyprice")
	private double gamesbuyprice;
	
	@Column(name = "gamessaleprice")
	private double gamessaleprice;
	
	@Column(name = "gamesstock")
	private int gamesstock;
	
	@Column(name = "gamesimg")
	private String gamesimg;

	public int getGamesid() {
		return gamesid;
	}

	public void setGamesid(int gamesid) {
		this.gamesid = gamesid;
	}

	public String getGamesname() {
		return gamesname;
	}

	public void setGamesname(String gamesname) {
		this.gamesname = gamesname;
	}

	public String getGamesnickname() {
		return gamesnickname;
	}

	public void setGamesnickname(String gamesnickname) {
		this.gamesnickname = gamesnickname;
	}

	public String getGamesdescription() {
		return gamesdescription;
	}

	public void setGamesdescription(String gamesdescription) {
		this.gamesdescription = gamesdescription;
	}

	public int getSellersid() {
		return sellersid;
	}

	public void setSellersid(int sellersid) {
		this.sellersid = sellersid;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public double getGamesbuyprice() {
		return gamesbuyprice;
	}

	public void setGamesbuyprice(double gamesbuyprice) {
		this.gamesbuyprice = gamesbuyprice;
	}

	public double getGamessaleprice() {
		return gamessaleprice;
	}

	public void setGamessaleprice(double gamessaleprice) {
		this.gamessaleprice = gamessaleprice;
	}

	public int getGamesstock() {
		return gamesstock;
	}

	public void setGamesstock(int gamesstock) {
		this.gamesstock = gamesstock;
	}

	public String getGamesimg() {
		return gamesimg;
	}

	public void setGamesimg(String gamesimg) {
		this.gamesimg = gamesimg;
	}
	
	
}
