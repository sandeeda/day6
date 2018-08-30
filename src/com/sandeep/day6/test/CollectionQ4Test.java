package com.sandeep.day6.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.sandeep.day6.Student;

class CollectionQ4Test {

	@Test
	void testStudentCollection() {

		TreeSet<Student> stud=new TreeSet<>();
		assertEquals(true, stud.add(new Student("Sandeep", 31, "CSE")));
		assertEquals(true, stud.add(new Student("Sudarshan", 32, "CSE")));
		assertEquals(true, stud.add(new Student("Manju", 1, "ECE")));
		assertEquals(true, stud.add(new Student("Navya", 25, "CSE")));
		assertEquals(true, stud.add(new Student("Navya", 85, "CSE")));
		assertEquals(false, stud.add(new Student("Navya", 85, "CSE")));
		assertEquals(true, stud.add(new Student("Sharad", 85, "CSE")));
		assertEquals(true, stud.add(new Student("Logi", 29, "CSE")));
		assertEquals(true, stud.add(new Student("Harini", 62, "ME")));
		
		
		System.out.println(stud);
		
	}

}
