package com.polymorphism;

public class Employee 
{
	int salary;
	String location;
	final String name;//final variable can be intialized here or in constructor
	Employee(String location,int salary)
	{
		name="sahil";
		this.salary=salary;
		this.location=location;
	}
	public int benefits()
	{
		
		return 30000;
	}
	
	public void superExample()
	{
		System.out.println("Super");
	}
	
	
}
