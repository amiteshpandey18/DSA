package com.TwoPointers;

public class Example1 {

	public static void main(String[] args) {

		// Element found
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		int left = 0;
		int right = arr.length - 1;

		int key = 6;
		int iterator = 1;
		while (left <= right) {

			System.out.println("Iterator number" + iterator);
			if (arr[left] == key || arr[right] == key) {
				System.out.println("Element found");
				return;
			}
			left++;
			right--;
			iterator++;
		}
		System.out.println("Not found");
	}

}