package com.polymorphism;

public class Override 
{

	
	public static void main(String[] args) 
	{
		SoftwareOverride soft=new SoftwareOverride("US",5000);
		System.out.println(soft.calculate());
		Employee emp=new SoftwareOverride("US", 3000);
		System.out.println(emp.benefits());
		//emp.calculate() With Employee as a reference we can only call only overridden methods due to run time polymorphism. 
		//We can not call non overridden methods like calculate
		
	}

}
