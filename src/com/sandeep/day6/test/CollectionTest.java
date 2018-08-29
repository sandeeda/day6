package com.sandeep.day6.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sandeep.day6.Car;
import com.sandeep.day6.CellPhone;
import com.sandeep.day6.Laptop;
import com.sandeep.day6.School;
import com.sandeep.day6.Television;

class CollectionTest {

	
	
	@Test
	void CarTest()
	{
		ArrayList<Car> car=new ArrayList<Car>();
		assertEquals(true, car.add(new Car("tata","nano",2005,100000)));
		assertEquals(true, car.add(new Car("bmw","x7",2005,300000)));
		assertEquals(true, car.add(new Car("hyundai","santro",2005,400000)));
		Car.printData(car);
		
	}
		
	
	@Test
	void CellPhoneTest()
	{
		ArrayList<CellPhone> cellphone = new ArrayList<CellPhone>();
		assertEquals(true, cellphone.add(new CellPhone("samsung", "j7", "great camera", "android", 1000)));
		assertEquals(true, cellphone.add(new CellPhone("apple", "i7", "worst phone", "ios", 1000000)));
		assertEquals(true, cellphone.add(new CellPhone("one+", "6", "great", "android", 10000)));
		CellPhone.printData(cellphone);
	}

}
