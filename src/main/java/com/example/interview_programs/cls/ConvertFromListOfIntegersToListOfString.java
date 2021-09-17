package com.example.interview_programs.cls;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertFromListOfIntegersToListOfString {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(12,34,56,76);
		convert(intList);
	}
	
	public static void convert(List<Integer> intList)
	{
		List<String> strList = intList.stream().map(Object::toString).collect(Collectors.toList());
		System.out.println(strList);
	}
}
