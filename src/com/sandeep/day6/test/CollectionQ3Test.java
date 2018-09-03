package com.sandeep.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import com.sandeep.day6.Student;

class CollectionQ3Test {


	@Test
	void testStudentCollection() {

		ArrayList<Student> stud=new ArrayList<>();
		assertEquals(true, stud.add(new Student("Sandeep", 31, "CSE")));
		assertEquals(true, stud.add(new Student("Sudarshan", 32, "CSE")));
		assertEquals(true, stud.add(new Student("Manju", 1, "ECE")));
		assertEquals(true, stud.add(new Student("Navya", 25, "CSE")));
		assertEquals(true, stud.add(new Student("Navya", 85, "CSE")));
		assertEquals(true, stud.add(new Student("Navya", 85, "CSE")));
		assertEquals(true, stud.add(new Student("Sharad", 85, "CSE")));
		assertEquals(true, stud.add(new Student("Logi", 29, "CSE")));
		assertEquals(true, stud.add(new Student("Harini", 62, "ME")));
		
		
		
		System.out.println(stud);
		
	}

}
