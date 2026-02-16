package com.BubbleSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int arr[] = { 90, 70, 30, 60, 50, 10 };
		int n = arr.length;

		for (int i = 0; i <= n - 2; i++) {
			for (int j = 0; j <= (n - 2 - i); j++) {

				if (arr[j] > arr[j + 1]) {
					//Swap
					int tem = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tem;
				}
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}