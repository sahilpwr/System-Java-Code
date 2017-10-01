package com.abstraction;

public class Abstraction extends AbstractTest implements Interface,InterfaceInput
{

	public static void main(String[] args)
	{
     Abstraction abs=new Abstraction();
     System.out.println(abs.area());
     abs.input();
     abs.print();
	}

	@Override
	public double area() 
	{
		
		return 4*4*this.pi();
		
	}

	@Override
	public void print() {
		System.out.println("Interface");
		
	}

	@Override
	public void input() {
	System.out.println("Interface Input");
		
	}

	

}
