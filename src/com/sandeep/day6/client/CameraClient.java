package com.sandeep.day6.client;

import java.util.HashSet;

public class CameraClient {
	 public static void main(String[] args) {
			
		 HashSet<Camera> products = new HashSet<>();
		 
		 products.add(new Camera("NK234", 35000, "NIKON"));
		 products.add(new Camera("CN221", 25000, "CANNON"));
		 products.add(new Camera("NK234", 35000, "NIKON"));
		 
		 for(Camera c : products) {
			 System.out.println(c);
		 }
	}
}
