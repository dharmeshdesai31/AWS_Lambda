package com.aws.lambda.servlet;

public class Address {
	private String country;
	private String city;
	private String state;
	private int zipCode;
	public Address(String country, String city, String state, int zipCode) {
		super();
		this.country = country;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	
}
