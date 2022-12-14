package com.example.interview_programs.str;

public class MoveAllUpperCaseLettersToEnd {
	
	public static void main(String[] args) {
		
		String s = "TKabRAMcGRDud409";
		move(s);
	}

	public static void move(String str)
	{
		StringBuilder upperCase = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++)
		{
			// 65 = A, 66 = B, 67 = C,.... and 90 =Z
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				upperCase.append(str.charAt(i));
			}
			else
			{
				sb.append(str.charAt(i));
			}
		}
		
		sb.append(upperCase);
		
		System.out.println(sb);
	}
}
