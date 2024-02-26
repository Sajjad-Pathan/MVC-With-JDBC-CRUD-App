package com.pojo;

public class Car {
	private String cName;
	private String cNumber;
	private String ownerName;

	public Car(String cName, String cNumber, String ownerName) {
		this.cName = cName;
		this.cNumber = cNumber;
		this.ownerName = ownerName;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcNumber() {
		return cNumber;
	}

	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
