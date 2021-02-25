package com.spring.bean;

public class Address {
	private String houseNo;
	private String location;

	public Address() {

	}

	public Address(String houseNo, String location) {
		this.houseNo = houseNo;
		this.location = location;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", location=" + location + "]";
	}
}
