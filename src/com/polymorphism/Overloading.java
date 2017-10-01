package com.polymorphism;

public class Overloading 
{
	//overloading by number of parameters
    int sum(int a,int b)
    {
    	return a+b;
    }
    int sum(int a,int b,int c)
    {
    	return a+b+c;
    }
    
    //overloading by different datatype
    int substract(int a,int b )
    {
    	return a-b;
    }
    float substract(float a,float b)
    {
    	return a-b;
    }
    
    //overloading by order of data type of parameters
    float multiply(int a,float b)
    {
    	return a*b;
    }
    float multiply(float b,int a)
    {
    	return a*b;
    }
	public static void main(String[] args) 
	{
		
	}

}
