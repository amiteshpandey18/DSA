package com.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter Value");

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original Array: " + Arrays.toString(arr));

		for (int i = 0; i <= n - 2; i++) {
			for (int j = 0; j <= (n - 2 - i); j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}