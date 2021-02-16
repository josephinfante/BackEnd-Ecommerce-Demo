package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table (name = "category")
public class Category {
	
	@Id
	@Column (name = "categoryid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryid;
	
	@Column (name = "categoryname")
	private String categoryname;
	
	@Column (name = "categoryimg")
	private String categoryimg;

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getCategoryimg() {
		return categoryimg;
	}

	public void setCategoryimg(String categoryimg) {
		this.categoryimg = categoryimg;
	}

}
