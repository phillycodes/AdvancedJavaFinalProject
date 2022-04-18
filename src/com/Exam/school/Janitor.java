package com.Exam.school;

import java.util.Objects;

public class Janitor extends Person
{
	//define variables
	protected int yearsService;
	protected float hourlyRate;
	
	// Constructor
	public Janitor(String personID, Name theName, Address theAddress, String dOB, String gender, String isASmoker,
			int yearsService, float hourlyRate) {
		super(personID, theName, theAddress, dOB, gender, isASmoker);
		this.yearsService = yearsService;
		this.hourlyRate = hourlyRate;
	}
	// getters and setters
	public int getYearsService() 
	{
		return yearsService;
	}
	
	

	public void setYearsService(int yearsService) 
	{
		this.yearsService = yearsService;
	}
	public float getHourlyRate() 
	{
		return hourlyRate;
	}
	public void setHourlyRate(float hourlyRate) 
	{
		this.hourlyRate = hourlyRate;
	}
	// toString
	@Override
	public String toString() {
		return "Janitor [yearsService=" + yearsService + ", hourlyRate=" + hourlyRate + "]";
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
		Janitor other = (Janitor) obj;
		return Float.floatToIntBits(hourlyRate) == Float.floatToIntBits(other.hourlyRate)
				&& yearsService == other.yearsService;
	}
	
}
