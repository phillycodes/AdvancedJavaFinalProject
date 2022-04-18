package com.Exam.school;

import java.util.Date;
import java.util.Objects;

public class Person
{
	// define variables
	private String firstName;
	private String lastName;
	private String middleInitial;
	private Name theName = new Name(firstName, lastName, middleInitial);
	private String streetNum;
	private String streetName;
	private String streetType;
	private String city;
	private String stateCode;
	private String zipCode;
	private Address theAddress = new Address( streetNum, streetName, streetType, city, stateCode, zipCode);
	private String personID;
	private String DOB;
	private String gender;
	private String isASmoker; // Use YES or NO
	
	// Constructor
	public Person(String personID, Name theName, Address theAddress, String dOB, String gender, String isASmoker) {
		//super();
		this.personID = personID;
		this.theName = theName;
		this.theAddress = theAddress;
		DOB = dOB;
		this.gender = gender;
		this.isASmoker = isASmoker;
	}
	// getters and setters
	public String getPersonID() {
		return personID;
	}
	public void setPersonID(String personID) {
		this.personID = personID;
	}
	public Name getTheName() {
		return theName;
	}
	public void setTheName(Name theName) {
		this.theName = theName;
	}
	public Address getTheAddress() {
		return theAddress;
	}
	public void setTheAddress(Address theAddress) {
		this.theAddress = theAddress;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIsASmoker() {
		return isASmoker;
	}
	public void setIsASmoker(String isASmoker) {
		this.isASmoker = isASmoker;
	}
	
	// toString
	@Override
	public String toString() {
		return "Person [theName=" + theName + ", theAddress=" + theAddress + ", DOB=" + DOB + ", gender=" + gender
				+ ", isASmoker=" + isASmoker + "]";
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
		Person other = (Person) obj;
		return Objects.equals(DOB, other.DOB) && Objects.equals(gender, other.gender)
				&& Objects.equals(isASmoker, other.isASmoker) && Objects.equals(theAddress, other.theAddress)
				&& Objects.equals(theName, other.theName);
	}
	
	
}
