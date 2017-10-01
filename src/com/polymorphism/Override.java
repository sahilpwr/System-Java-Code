package com.polymorphism;

public class Override extends SoftwareOverride
{

	
	public Override(String location, int salary)
	{
		super("", 0);
		// TODO Auto-generated constructor stub
	}
	
	//we can not override finalMethodExample() since it is final in SoftwareOvertide class
	public static void main(String[] args) 
	{
		Override over=new Override("",0);
		
		
		SoftwareOverride soft=new SoftwareOverride("US",5000);
		System.out.println(soft.calculate());
		Employee emp=new SoftwareOverride("US", 3000);
		System.out.println(emp.benefits());
		//emp.calculate() With Employee as a reference we can only call only overridden methods due to run time polymorphism. 
		//We can not call non overridden methods like calculate
		
	}

}
