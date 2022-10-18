package com.example.interview_programs;

public class EvenOrOddNumberExample {

	public static void main(String[] args) {
		
		int number = 41;
		findGivenNumberIsEvenOrOdd(number);
	}
	
	public static void findGivenNumberIsEvenOrOdd(int number)
	{
		if(number%2 == 0)
		{
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Given number is odd");
		}
	}
}
