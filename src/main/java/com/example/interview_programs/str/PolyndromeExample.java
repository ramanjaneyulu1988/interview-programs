package com.example.interview_programs.str;

public class PolyndromeExample {

	public static void main(String[] args) {
		
		String str = "haaah";
		boolean b = isPolindrome1(str);
		if(b)
		{
			System.out.println(str+" is Polindrome");
		}
		else
		{
			System.out.println(str+" is not Polindrome");
		}
	}
	
	public static boolean isPolindrome(String str)
	{
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse = reverse.concat(""+str.charAt(i));
		}
		
		if(str.equals(reverse))
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean isPolindrome1(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String reverse = sb.toString();
		
		if(str.equals(reverse))
		{
			return true;
		}
		
		return false;
	}
}
