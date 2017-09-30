package com.object;



public class ThisKeyword
{
	String name;
	int id;
	int age;
	public ThisKeyword() 
	{
	 //using this to call constructor
	 this(2,3);
	 name="sahil";
	 System.out.println(id+name+age);
	}
	public ThisKeyword(int id,int age)
	{
		this.id=id;
		this.age=age;
		
	}
	void initialize(String name,int id,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		//this() we can not call a constructor from method
		this.method();
		
		//passing current object to a method in another class
		Test t=new Test();
		t.testMethod(this);
	}
	void method()
	{
		
	}
	
	public static void main(String[] args)
	{
		//to refer current variables
	
		ThisKeyword th=new ThisKeyword();
		th.initialize("sahil", 2,24);
	
	}
}
 