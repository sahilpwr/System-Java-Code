package com.polymorphism;

public class SoftwareOverride extends Employee
{
	int bonus;
	int compensation;
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
	
}
