package com.example.interview_programs.str;

import java.util.Arrays;

public class ConvertFromStringArrayToIntArray {

	public static void main(String[] args) {
		
		String s[] = {"123","456","789"};
		
		int i[] = new int[s.length];
		for(int j=0; j<s.length; j++)
		{
			i[j] = Integer.parseInt(s[j]);
		}
		
		System.out.println(Arrays.toString(i));
	}
}
