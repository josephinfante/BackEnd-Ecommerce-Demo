package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@Column (name = "usersid")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int usersid;
	
	@Column (name = "usersname")
	private String usersname;
	
	@Column (name = "userslastname")
	private String userslastname;
	
	@Column (name = "usersemail")
	private String usersemail;
	
	@Column (name = "userspassword")
	private String userspassword;
	
	@Column (name = "rolesid")
	private int rolesid;
	
	@Column (name = "transactionsid")
	private int transactionsid;

	public int getUsersid() {
		return usersid;
	}

	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}

	public String getUsersname() {
		return usersname;
	}

	public void setUsersname(String usersname) {
		this.usersname = usersname;
	}

	public String getUserslastname() {
		return userslastname;
	}

	public void setUserslastname(String userslastname) {
		this.userslastname = userslastname;
	}

	public String getUsersemail() {
		return usersemail;
	}

	public void setUsersemail(String usersemail) {
		this.usersemail = usersemail;
	}

	public String getUserspassword() {
		return userspassword;
	}

	public void setUserspassword(String userspassword) {
		this.userspassword = userspassword;
	}

	public int getRolesid() {
		return rolesid;
	}

	public void setRolesid(int rolesid) {
		this.rolesid = rolesid;
	}

	public int getTransactionsid() {
		return transactionsid;
	}

	public void setTransactionsid(int transactionsid) {
		this.transactionsid = transactionsid;
	}
	
}
