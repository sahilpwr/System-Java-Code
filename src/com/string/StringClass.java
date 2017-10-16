package com.string;

import java.io.ByteArrayInputStream;

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
		
		//String Methods:
		
		String java="Java Tutorial";
		String javaEE="Java Enterprise";
		String javaCase="java entrerprise";
		
		//charAt()
		System.out.println(java.charAt(8));
		
		//compareTo()
		System.out.println(java.compareTo(javaEE));
		
		//concat
		System.out.println(java.concat(javaEE));
		
		//contains
		System.out.println(java.contains("Java"));
		System.out.println(java.contains("java"));
		
		//equals()
		System.out.println(java.equals(javaEE));
		
		//equalsIgnoreCase()
		System.out.println(javaEE.equalsIgnoreCase(javaCase));
		
		//getBytes
		byte []bytearray=java.getBytes();
		for(byte j:bytearray)
		{
			System.out.println(j);
		}
		
		
		//isEmpty()
		System.out.println(java.isEmpty());
		
		//length()
		System.out.println(java.length());
		
		//replace()
		System.out.println(java.replace('a', 'b'));
		
		//replaceAll()
		System.out.println(java.replaceAll("av","bb"));
		
		//split()
		String[] split=java.split("\\s");
		for(String w:split)
		{
			System.out.println(w);
		}
		
		//substring()
		System.out.println(java.substring(5));
		System.out.println(java.substring(0, 5));
		
		//toCharArray()
		char[] chararray=java.toCharArray();
		for(char w:chararray)
		{
			System.out.print(w);
		}
		//trim()
		String trim=" Java ";
		System.out.println(trim.trim());
		
		//valueOf() //string representation of given value
		int val=50;
		String string=String.valueOf(50);
		System.out.println(string);
		
		//lower case & upper case
		System.out.println(java.toUpperCase());
		System.out.println(javaEE.toLowerCase());
	
		
	}

}
