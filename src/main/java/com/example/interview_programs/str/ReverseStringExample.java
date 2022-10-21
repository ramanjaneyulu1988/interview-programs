package com.example.interview_programs.str;

public class ReverseStringExample {

	public static void main(String[] args) {
		
		String str = "Rajesh";
		reverseString1(str);
		
	}
	
	public static void reverseString(String str)
	{
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse = reverse.concat(""+str.charAt(i));
		}
		
		System.out.println(reverse);
	}
	
	public static void reverseString1(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String reverse = sb.toString();
		
		System.out.println(reverse);
	}
}
