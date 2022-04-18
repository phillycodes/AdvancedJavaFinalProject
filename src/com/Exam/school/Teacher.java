package com.Exam.school;

import java.util.Objects;

public class Teacher extends Person
{
	//define variables
	protected String subjectTaught;
	protected int numClassesTaught;
	protected int officeNumber;
	
	// Constructor
	public Teacher(String personID, Name theName, Address theAddress, String dOB, String gender, String isASmoker,
			String subjectTaught, int numClassesTaught, int officeNumber) {
		super(personID, theName, theAddress, dOB, gender, isASmoker);
		this.subjectTaught = subjectTaught;
		this.numClassesTaught = numClassesTaught;
		this.officeNumber = officeNumber;
	}
	// getter and setters
	public String getSubjectTaught() {
		return subjectTaught;
	}
	
	public void setSubjectTaught(String subjectTaught) {
		this.subjectTaught = subjectTaught;
	}
	public int getNumClassesTaught() {
		return numClassesTaught;
	}
	public void setNumClassesTaught(int numClassesTaught) {
		this.numClassesTaught = numClassesTaught;
	}
	public int getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(int officeNumber) {
		this.officeNumber = officeNumber;
	}
	// toString
	@Override
	public String toString() {
		return "Teacher [subjectTaught=" + subjectTaught + ", numClassesTaught=" + numClassesTaught + ", officeNumber="
				+ officeNumber + "]";
	}
	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return numClassesTaught == other.numClassesTaught && officeNumber == other.officeNumber
				&& Objects.equals(subjectTaught, other.subjectTaught);
	}
	
	
	
}
