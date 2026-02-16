package com.TwoPointers;

public class Example2 {

	public static void main(String[] args) {

		
		// Pair found 
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int target = 14;
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				System.out.println(arr[left] + " " + arr[right]);
				return;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		
		System.out.println("No pair found");
	}
}