package com.string;

import java.io.StringBufferInputStream;

public class StringClass {

	public static void main(String[] args) 
	{
		//STRING CLASS
		
		char[] ch= {'J','A','V','A'};
		String s = new String(ch);
		System.out.println(s);
				
		//ways to create string:
		
		//By literal method:
		String s1="sahil";
		//By new keyword:
		String s2=new String("sahil");
		
		//String class is immutable
		String s3="pawar";
		s3.concat(" sahil");
		System.out.println(s3);
		
		s3=s3.concat(" sahil");
		System.out.println(s3);
		
		//String Buffer class:
		StringBuffer sb=new StringBuffer("sahil");
		sb.append(" pawar");
		System.out.println(sb);
		
		//String Builder Class
		StringBuilder sbu=new StringBuilder("sahil");
		sbu.append(" pawar");
		System.out.println(sbu);
		
		//String Buffer & Builder Class methods
		//append() insert() delete() replace() reverse() capacity()
		
	}

}
