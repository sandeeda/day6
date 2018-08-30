package com.sandeep.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.sandeep.day6.Car;

class CollectionQ5Test {

	@Test
	void testCar() {

		TreeSet<Car> car= new TreeSet<>();
		assertEquals(true, car.add(new Car("tata","nano",2005,100000)));
		assertEquals(true, car.add(new Car("bmw","x7",2005,300000)));
		assertEquals(false, car.add(new Car("bmw","x7",2005,300000)));
		assertEquals(true, car.add(new Car("hyundai","santro",2005,400000)));	
		assertEquals(true, car.add(new Car("maserati","santro",2005,400000)));	
		assertEquals(false, car.add(new Car("hyundai","santro",2005,400000)));	
		assertEquals(true, car.add(new Car("lamborghini","santro",2005,400000)));	
		assertEquals(true, car.add(new Car("jeep","santro",2005,400000)));	
		assertEquals(true, car.add(new Car("ford","santro",2005,400000)));	
		assertEquals(true, car.add(new Car("fiat","santro",2005,400000)));
		
		System.out.println(car);
		
	}

}
