package com.inhertance;

public class SoftwareInherit extends Employee
{
	int bonus;
	int compensation;
	public SoftwareInherit(String location,int salary) 
	{
		super(location,salary);
		bonus=50000;
	}
	int calculate()
	{
		return compensation=salary+bonus;
	}
	public void print(String a)
	{}
}
