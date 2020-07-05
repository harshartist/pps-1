package com.cg.PPS.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * @author Madhura
 *
 */
@Entity
public class AdminUser {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	Integer sessionId;
	String userName;
	String Password;
	
	public Integer getsessionId() {
		return sessionId;
	}
	public void setsessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public AdminUser(Integer sessionId, String userName, String password) {
		super();
		this.sessionId = sessionId;
		this.userName = userName;
		this.Password = password;
	}
	public AdminUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [sessionId=" + sessionId + ", userName=" + userName + ", Password=" + Password + "]";
	}
	
	
	

}
