package com.example.interview_programs.str;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindRepeatedWordsFromString {

public static void main(String[] args) {
		
		String s = "Welcome to Bangalore and Welcome to Hyderabad";
		findRepeatedWords(s);
	}
	
	public static void findRepeatedWords(String s)
	{
		String str[] = s.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(String s1 : str)
		{
			if(map.get(s1) != null)
			{
				map.put(s1, map.get(s1)+1);
			}
			else
			{
				map.put(s1, 1);
			}
		}
		
//		print unique words
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			// print duplicate words
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey() +" "+ entry.getValue()+ " times occured");
			}
		}
	}
}
