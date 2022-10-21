package com.example.interview_programs.str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertFromListOfStringToString {
	
	public static void main(String[] args) {
		
//		List<String> list = Arrays.asList("abc","xyz","aaa");
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("aaa");
		
		System.out.println(list);
		convert1(list);
	}

	public static void convert(List<String> strList)
	{
		String result = strList.stream().map(s -> String.valueOf(s)).collect(Collectors.joining(",", "", ""));
		System.out.println(result);
	}
	
	public static void convert1(List<String> strList)
	{
		String result = "";
		int count = 0;
		for(String s : strList)
		{
			if(count == 0)
			{
				result = result.concat(s);
			}
			else
			{
				result = result.concat(","+s);
			}
			
			count++;
		}
		
		System.out.println(result);
	}
}
