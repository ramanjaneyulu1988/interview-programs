package com.example.interview_programs.str;

public class MoveAllLowerCaseLettersToEnd {

	public static void main(String[] args) {

		String s = "TKabRAMcGRDud409";
		move(s);
	}

	public static void move(String str)
	{
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++)
		{
			// A = 65, B = 66,.....
			// a = 97, b = 98, ......
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				lowerCase.append(str.charAt(i));
			}
			else
			{
				sb.append(str.charAt(i));
			}
		}

		sb.append(lowerCase);

		System.out.println(sb);
	}
}
