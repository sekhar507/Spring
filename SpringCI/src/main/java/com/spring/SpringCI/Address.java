package com.spring.SpringCI;

public class Address {
	private String city;
	private String state;
	private String country;
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	

}
