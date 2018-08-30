package com.sandeep.day6;

public class Student implements Comparable<Student> {

	private String name;
	private int roll;
	private String branch;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int roll, String branch) {
		super();
		this.name = name;
		this.roll = roll;
		this.branch = branch;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", branch=" + branch + "]\n";
	}
	@Override
	public int compareTo(Student stud) {
		// TODO Auto-generated method stub
		int result=this.name.compareTo(stud.name);
		if(result==0)
			return Integer.compare(this.roll, stud.roll);
		return result;
	}
	
	
	
	
}
