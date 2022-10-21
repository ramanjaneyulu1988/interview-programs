package com.example.interview_programs.cls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertFromListOfIntegersToListOfString {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(12,34,56,76);
		System.out.println(intList);
		convert1(intList);
	}
	
	public static void convert(List<Integer> intList)
	{
		List<String> strList = intList.stream().map(Object::toString).collect(Collectors.toList());
		System.out.println(strList);
	}
	
	public static void convert1(List<Integer> intList)
	{
		List<String> strList = new ArrayList<String>();
		
		for(Integer i : intList)
		{
			String s = String.valueOf(i);
			strList.add(s);
		}
		
		System.out.println(strList);
	}
}
