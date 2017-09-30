package com.object;

public class StaticKeyword
{
	static String lastname;
	static
	{
		//can access only static variables
		lastname="pawar";
		//int lastid=2; lastid will be only local to the block
	}
	
	int id;
	static String name;
	static int counter=0;
	public StaticKeyword() 
	{
		counter++;
	}
	public static void intialize()
	{
		//static method can access only static variables
		counter++;
	}
	void NonStaticTest()
	{
		
	}
	public static void test(StaticKeyword st)
	{
		//static method can not access non static method directly
		//NonStaticTest();
	}
	
	public static void main(String[] args)
	{
	  StaticKeyword st=new StaticKeyword();
	  StaticKeyword st2=new StaticKeyword();
	  System.out.println(st2.counter);
	  StaticKeyword.intialize();
	  System.out.println(st2.counter);
	  st2.test(st2);
	 
	}
}
