package com.Exam.school;

import java.util.Objects;

public class States 
{
	// define variables
	String stateCode;
	String stateDescrip;
	
	// Constructor
	public States(String stateCode, String stateDescrip) {
		//super();
		this.stateCode = stateCode;
		this.stateDescrip = stateDescrip; //
	}
	//getters and setters
	public String getStateCode() {
		return stateCode;
	}
	
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateDescrip() {
		return stateDescrip;
	}
	public void setStateDescrip(String stateDescrip) {
		this.stateDescrip = stateDescrip;
	}
	// toString
	@Override
	public String toString() {
		return "States [stateCode=" + stateCode + ", stateDescrip=" + stateDescrip + "]";
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
		States other = (States) obj;
		return Objects.equals(stateCode, other.stateCode) && Objects.equals(stateDescrip, other.stateDescrip);
	}
	
}
