package com.test;

public class TC1 {

	public static void main(String[] args) {
		String str="Suresh123Goutam";
		
		System.out.println("Before removing char the string is: "+str);

		
		String output=str.replaceAll("[^0-9]", "");
		
		System.out.println("After removing char the string is : "+output);
	    

	}

	}


