package com.spring.bean;

public class User {
	private int userId;
	private String userName;
	private String city;
	private Address address;

	public User() {
		super();
	}

	public User(int userId, String userName, String city) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.city = city;
	}
	
	public User(int userId, String userName, String city, Address address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.city = city;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", city=" + city + ", address=" + address + "]";
	}

}
