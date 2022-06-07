package com.example.demo.model;

public class Registered_User {
	
	private int user_id;
	private String country;
	private String password;
	private String email;
	
	
	@Override
	public String toString() {
		return "Registered_User [user_id=" + user_id + ", country=" + country + ", password=" + password + ", email="
				+ email + "]";
	}
	public Registered_User() {
		super();
	}
	public Registered_User(int user_id, String country, String password, String email) {
		super();
		this.user_id = user_id;
		this.country = country;
		this.password = password;
		this.email = email;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
