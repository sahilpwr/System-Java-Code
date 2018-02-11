package com.inhertance;

public class ManagerInherit extends Employee
{
	int bonus;
	int compensation;
	public ManagerInherit(int salary,String location)
	{
		super(location,salary);
		bonus=100000;
	}
	int calculate()
	{
		return compensation=salary+bonus;
	}
	public void print(String a)
	{}
}
