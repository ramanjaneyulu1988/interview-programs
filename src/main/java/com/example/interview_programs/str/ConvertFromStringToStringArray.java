package com.example.interview_programs.str;

public class ConvertFromStringToStringArray {

	public static void main(String[] args) {
		
		String cities = "Bangalore,Hyderabad,Chennai";
		
		String[] citiesArray = cities.split(",");
		for(String city : citiesArray)
		{
			System.out.println(city);
		}
	}
}
