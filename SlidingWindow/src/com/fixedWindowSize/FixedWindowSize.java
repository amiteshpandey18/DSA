package com.fixedWindowSize;

public class FixedWindowSize {

	public static void main(String[] args) {

		
		// Fixed in size Sliding window
		
		int arr[] = { 10, 20, 30, 40, 50, 60 };

		int winSize = 2;
		int winSum = arr[0] + arr[1];
		System.out.println(winSum);

		for (int i = winSize; i <= arr.length - 1; i++) {
			winSum = winSum - arr[i - winSize] + arr[i];
			System.out.println(winSum);
		}
	}
}