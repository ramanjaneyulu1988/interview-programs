package com.example.interview_programs.str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertFromListOfStringToString {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abc","xyz","aaa");
		convert(list);
	}

	public static void convert(List<String> strList)
	{
		String result = strList.stream().map(s -> String.valueOf(s)).collect(Collectors.joining(" ", "", ""));
		System.out.println(result);
	}
}
