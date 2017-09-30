package com.object;

public class JavaClass 
{
	String name;
	int id;
	public JavaClass()
	{
	name="Kevin";
	id=22;
	
	}
	public JavaClass(JavaClass copy)
	{
		id=copy.id;
		name=copy.name;
	}
	public void intiailize()
	{
		name="sahil";
		id=54;
		
	}
	
	public static void main(String[] args)
	{
		//3 ways of object initialization
		//object
		JavaClass jc=new JavaClass();
		jc.name=null;
		jc.id=0;
		//constructor
		JavaClass jc2=new JavaClass();
		//method
		JavaClass jc3=new JavaClass();
		jc3.intiailize();
		
		//anonymous  object
		new JavaClass().intiailize();
	
		//copy constructor
		
		JavaClass copyConstructor=new JavaClass(jc2);
		System.out.println(copyConstructor.name);
		

	}

}
