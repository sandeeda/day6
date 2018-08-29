package com.sandeep.day6;

import java.util.ArrayList;

public class Car {

	private String make;
	private String model;
	private int year;
	private double price;
	
	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}


	public static void printData(ArrayList<Car> car) {
		for (Car car2 : car) {
			System.out.println("Make: "+car2.make+" model: "+car2.model+" year :"+car2.year+" price "+car2.price);
		}
	}





	
}
