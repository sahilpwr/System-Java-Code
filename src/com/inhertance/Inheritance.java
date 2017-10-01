package com.inhertance;

public class Inheritance 
{

	
	public static void main(String[] args) 
	{
		SoftwareInherit soft=new SoftwareInherit("US",5000);
		System.out.println(soft.calculate());
		ManagerInherit mang=new ManagerInherit(4000, "US");
		System.out.println(mang.calculate());
	}

}
