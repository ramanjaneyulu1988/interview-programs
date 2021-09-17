package com.example.interview_programs.str;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindUniqueWordsFromString {

	public static void main(String[] args) {
		
		String s = "Welcome to Bangalore and Welcome to Hyderabad";
		findUniqueWords(s);
	}
	
	public static void findUniqueWords(String s)
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
			// print unique words
			if(entry.getValue() == 1)
			{
				System.out.println(entry.getKey());
			}
		}
	}
}
