package com.sandeep.day6.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.sandeep.day6.Car;
import com.sandeep.day6.CellPhone;
import com.sandeep.day6.Laptop;
import com.sandeep.day6.School;
import com.sandeep.day6.Television;

class CollectionTest {

	
	
	@Test
	void testCar()
	{
		HashSet<Car> car=new HashSet<Car>();
		assertEquals(true, car.add(new Car("tata","nano",2005,100000)));
		assertEquals(true, car.add(new Car("bmw","x7",2005,300000)));
		assertEquals(false, car.add(new Car("bmw","x7",2005,300000)));
		assertEquals(true, car.add(new Car("hyundai","santro",2005,400000)));
		System.out.println(car);
		
		
	}
		
	
	@Test
	void testCellPhone()
	{
		HashSet<CellPhone> cellphone = new HashSet<CellPhone>();
		assertEquals(true, cellphone.add(new CellPhone("samsung", "j7", "great camera", "android", 1000)));
		assertEquals(true, cellphone.add(new CellPhone("apple", "i7", "worst phone", "ios", 1000000)));
		assertEquals(false, cellphone.add(new CellPhone("apple", "i7", "worst phone", "ios", 1000000)));
		assertEquals(true, cellphone.add(new CellPhone("one+", "6", "great", "android", 10000)));
		System.out.println(cellphone);
	}
	
	
	@Test
	void  testLaptop()
	{
		HashSet<Laptop>laptop=new HashSet<Laptop>();
		assertEquals(true, laptop.add(new Laptop("hp","proBook","windows","i5")));
		assertEquals(true, laptop.add(new Laptop("hp","pavilion","windows","i3")));
		assertEquals(false, laptop.add(new Laptop("hp","pavilion","windows","i3")));
		assertEquals(true, laptop.add(new Laptop("apple","macBook pro","macOS","i7")));
		System.out.println(laptop);
	}

	@Test
	void testSchool()
	{
		HashSet<School> school=new HashSet<School>();
		assertEquals(true, school.add(new School("STS", "ranchi", "ICSE", "ranchi", 1)));
		assertEquals(true, school.add(new School("DPS", "ranchi", "CBSE", "ranchi", 2)));
		assertEquals(false, school.add(new School("DPS", "ranchi", "CBSE", "ranchi", 2)));
		assertEquals(true, school.add(new School("Sacred Heart", "ranchi", "ICSE", "ranchi", 3)));
		System.out.println(school);
	}
	
	
	@Test
	void testTelevision()
	{
		HashSet<Television> tel=new HashSet<Television>();
		assertEquals(true, tel.add(new Television("mi","4k led",true,40000)));
		assertEquals(true, tel.add(new Television("samsung","led",false,40000)));
		assertEquals(false, tel.add(new Television("samsung","led",false,40000)));
		assertEquals(true, tel.add(new Television("sony","4k oled",true,440000)));
		System.out.println(tel);
	}

}
