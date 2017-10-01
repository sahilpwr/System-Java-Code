package com.polymorphism;

public class Employee 
{
	int salary;
	String location;
	final String name="Sahil";
	Employee(String location,int salary)
	{
		this.salary=salary;
		this.location=location;
	}
	public int benefits()
	{
		return 30000;
	}
	
	
}
