package com.sandeep.day6;

import java.util.Objects;

public class Car implements Comparable<Car> {

	@Override
	public int hashCode() {
		return Objects.hash(make,model);
		
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		Car c = (Car)obj;
		return this.make==c.make && this.model==c.model;
	}


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

	public String toString()
	{
		return "model=" + model + ", price=" + price + ", make=" + make + ", year="+year+"\n";

	}


	@Override
	public int compareTo(Car car) {
		// TODO Auto-generated method stub
		return this.make.compareTo(car.make);
	}



	
}
