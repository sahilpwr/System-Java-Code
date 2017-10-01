package com.polymorphism;

public class SoftwareOverride extends Employee
{
	int bonus;
	int compensation;
	static final int id;//can be initialize here or in static block only
	
	static
	{
		id=200;
	}
	
	public SoftwareOverride(String location,int salary) 
	{
		super(location,salary);
		bonus=50000;
	}
	
	
	//method overriding. We cannot override static and final method
	public int benefits()
	{
		return 20000+bonus;
		
	}
	int calculate()
	{
		return compensation=salary+bonus;
	}
	
	//final method
	final void finalMethodExample()
	{
		System.out.println("pawar");
	}
	

	
}
