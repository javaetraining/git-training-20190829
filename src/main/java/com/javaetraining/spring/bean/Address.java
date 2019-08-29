package com.javaetraining.spring.bean;

import org.springframework.beans.factory.annotation.Required;

public class Address {

	private String houseNumber;
	private String street;
	private String city;
	private String country;
	private String zipCode;

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	@Required
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street
				+ ", city=" + city + ", country=" + country + ", zipCode="
				+ zipCode + "]\n";
	}

}
