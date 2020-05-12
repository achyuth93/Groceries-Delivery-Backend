package com.Groceries.GroceriesBackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	private String uemail;
	private String uname;
	private String upwd;
	private String ucpwd;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUcpwd() {
		return ucpwd;
	}

	public void setUcpwd(String ucpwd) {
		this.ucpwd = ucpwd;
	}

}
