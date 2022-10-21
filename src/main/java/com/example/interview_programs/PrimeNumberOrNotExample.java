package com.example.interview_programs;

public class PrimeNumberOrNotExample {

	public static void main(String[] args) 
	{
		int number = 9;
		isPrime(number);
	}
	public static void isPrime(int num)
	{
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) 
		{
			// condition for nonprime number
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag)
		{
			System.out.println(num + " is a prime number.");
		}
		else
		{
			System.out.println(num + " is not a prime number.");
		}
	}

}
