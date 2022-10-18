package com.example.interview_programs.str;

public class AnagramExample {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "cba";
		
		boolean b = isAnagram(s1, s2);
		if(b)
		{
			System.out.println("Given Strings are anagram");
		}
		else
		{
			System.out.println("Give Strigns are not anagram");
		}
	}

	public static boolean isAnagram(String s1, String s2)
	{
		boolean b = false;
		if(s1.length() == s2.length())
		{
			for(int i=0; i<s1.length(); i++)
			{
				if(s2.contains(""+s1.charAt(i)))
				{
					return true;
				}
				else
				{
					return b;
				}
			}
		}
		return b;
	}
}
