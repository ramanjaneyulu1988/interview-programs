package com.example.interview_programs.str;

public class MoveAllUpperCaseLettersToEnd {
	
	public static void main(String[] args) {
		
		String s = "abcGRDud";
		move(s);
	}

	public static void move(String str)
	{
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				sb.append(str.charAt(i));
			}
			else
			{
				sb1.append(str.charAt(i));
			}
		}
		
		sb1.append(sb);
		System.out.println(sb1);
	}
}
