package com.sandeep.day6.client;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetClient {
public static void main(String[] args) {
		
		Comparator<Camera> priceComparator = (c1, c2) -> {
			int result = Double.compare(c2.getPrice(), c1.getPrice());
			if(result == 0)
				return c2.getModel().compareTo(c1.getModel());
			return result;
		};
		
		TreeSet<Camera> products = new TreeSet<>(priceComparator);
		
		 products.add(new Camera("NK234", 35000, "NIKON"));
		 products.add(new Camera("CN221", 25000, "CANNON"));
		 products.add(new Camera("NK556", 65000, "NIKON"));
		 products.add(new Camera("SN345", 25000, "SONY"));
		 products.add(new Camera("CD233", 16000, "KODAK"));
		 
		 for (Camera camera : products) {
			System.out.println(camera);
		}		 
	}	
}
