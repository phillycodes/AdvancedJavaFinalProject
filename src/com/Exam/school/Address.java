package com.Exam.school;

import java.util.Objects;

public class Address 
{
	protected String streetNum;
	protected String streetName;
	protected String streetType;
	protected String city;
	protected String stateCode;
	protected String zipCode;
	
	// Constructors
	public Address(String streetNum, String streetName, String streetType, String city, String stateCode,
			String zipCode) {
		//super();
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.streetType = streetType;
		this.city = city;
		this.stateCode = stateCode;
		this.zipCode = zipCode;
	}
	// getters and setters
	public String getStreetNum() {
		return streetNum;
	}
	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStreetType() {
		return streetType;
	}
	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	// toString
	@Override
	public String toString() {
		return "Address [streetNum=" + streetNum + ", streetName=" + streetName + ", streetType=" + streetType
				+ ", city=" + city + ", stateCode=" + stateCode + ", zipCode=" + zipCode + "]";
	}
	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(stateCode, other.stateCode)
				&& Objects.equals(streetName, other.streetName) && Objects.equals(streetNum, other.streetNum)
				&& Objects.equals(streetType, other.streetType) && Objects.equals(zipCode, other.zipCode);
	}

}
