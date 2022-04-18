package com.Exam.school;

import java.util.Objects;

public class Name 
{
	protected String firstName = "";
	protected String lastName = "";
	protected String middleInitial = "";
	
	// Constructor
	public Name(String firstName, String lastName, String middleInitial) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInitial = middleInitial;
	}
	// getters and setters
	public void setFirstName(String fname) 
	{
		this.firstName = fname;
	}
	
	public String getFirstName() 
	{
		return this.firstName;
	}
	
	public void setLastName(String lname) 
	{
		this.lastName = lname;
	}
	public String getLastName() 
	{
		return this.lastName;
	}
	
	public void setMiddleInitial(String midint) 
	{
		this.middleInitial = midint;
	}
	public String getMiddleInitial() 
	{
		return this.middleInitial;
	}
	// toString
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + ", middleInitial=" + middleInitial + "]";
	}
	// equal
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(middleInitial, other.middleInitial);
	}
	
	
	
}
