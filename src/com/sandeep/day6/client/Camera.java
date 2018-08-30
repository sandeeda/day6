package com.sandeep.day6.client;

import java.util.Objects;

public class Camera implements Comparable<Camera> {
	private String model;
	private double price;
	private String brand;

	public Camera() {
		super();
	}

	public Camera(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Camera [model=" + model + ", price=" + price + ", brand=" + brand + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Camera c2 = (Camera) obj;
		return this.brand == c2.brand && this.model == c2.model 
					&& this.price == c2.price;
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, price, model);
	}

	@Override
	public int compareTo(Camera c2) {
		//int result = Double.compare(this.price, c2.price);
		int result = this.brand.compareTo(c2.brand);
		if(result == 0)
			return this.model.compareTo(c2.model);
		return result;
	}

}


