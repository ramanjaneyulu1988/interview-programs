package com.example.interview_programs.arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{ 
		int[] arr = {10, 20, 60, 40, 50}; 
		reverse(arr, arr.length); 
	} 
	
	public static void reverse(int a[], int n) 
	{ 
		int[] b = new int[n]; 
		int j = n; 
		for (int i = 0; i < n; i++) { 
			b[j - 1] = a[i]; 
			j = j - 1; 
		} 

		// printing the reversed array 
		System.out.println("Reversed array is: \n"); 
		for (int k = 0; k < n; k++) { 
			System.out.println(b[k]); 
		} 
	} 
}
