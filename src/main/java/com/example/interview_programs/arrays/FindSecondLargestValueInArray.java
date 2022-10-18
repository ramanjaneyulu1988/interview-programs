package com.example.interview_programs.arrays;

public class FindSecondLargestValueInArray {

	public static void main(String[] args) {

		int i[] = {2,1,5,8,3,10};
		int value = findSecondLargestValue(i);
		System.out.println(value);
	}

	public static int findSecondLargestValue(int[] values)
	{
		for(int i=0; i<values.length; i++)
		{
			for(int j=i+1; j<values.length; j++)
			{
				if(values[i] > values[j])
				{
					int temp = values[i];

					values[i] = values[j];
					values[j] = temp;
				}
			}
		}

		return values[values.length-2];

	}
}
