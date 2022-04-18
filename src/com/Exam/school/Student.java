package com.Exam.school;

import java.util.Objects;

public class Student extends Person
{
	
	//define variables
	protected String major;
	protected float theGPA;
	protected float creditsCompleted;
	
	// Constructor
	public Student(String personID, Name theName, Address theAddress, String dOB, String gender, String isASmoker,
			String major, float theGPA, float creditsCompleted) {
		super(personID, theName, theAddress, dOB, gender, isASmoker);
		this.major = major;
		this.theGPA = theGPA;
		this.creditsCompleted = creditsCompleted;
	}
	// getters and setters
	public String getMajor() 
	{
		return major;
	}
	
	public void setMajor(String major) 
	{
		this.major = major;
	}
	public float getTheGPA() 
	{
		return theGPA;
	}
	public void setTheGPA(float theGPA) 
	{
		this.theGPA = theGPA;
	}
	public float getCreditsCompleted() 
	{
		return creditsCompleted;
	}
	public void setCreditsCompleted(float creditsCompleted) 
	{
		this.creditsCompleted = creditsCompleted;
	}
	// toString
	@Override
	public String toString() {
		return "Student [major=" + major + ", theGPA=" + theGPA + ", creditsCompleted=" + creditsCompleted + "]";
	}
	// equal
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Float.floatToIntBits(creditsCompleted) == Float.floatToIntBits(other.creditsCompleted)
				&& Objects.equals(major, other.major)
				&& Float.floatToIntBits(theGPA) == Float.floatToIntBits(other.theGPA);
	}
	
	
	
}
