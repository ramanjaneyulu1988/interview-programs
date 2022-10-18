package com.example.interview_programs.str;

public class PolyndromeExample {

	public static void main(String[] args) {
		
		String str = "aba";
		boolean b = isPolindrome(str);
		if(b)
		{
			System.out.println("Given String is Polindrome");
		}
		else
		{
			System.out.println("Given String is not Polindrome");
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
}
