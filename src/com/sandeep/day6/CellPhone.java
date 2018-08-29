package com.sandeep.day6;

import java.util.ArrayList;

public class CellPhone {

	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private double price;
	public CellPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CellPhone(String company, String model, String description, String operatingSystem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	public static void printData(ArrayList<CellPhone> cellphone) {
		// TODO Auto-generated method stub
		for (CellPhone cellPhone2 : cellphone) {
			System.out.println("company: "+cellPhone2.company+" model: "+cellPhone2.model+" Description: "+cellPhone2.description+" OS: "+cellPhone2.operatingSystem+" price: "+cellPhone2.price);
			
		}
	}
	

}
