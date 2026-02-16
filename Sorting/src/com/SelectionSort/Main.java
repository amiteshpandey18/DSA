package com.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter Array");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i <= n - 2; i++) {
			int minidx = i;
			for (int j = minidx + 1; j <= n - 1; j++) {
				if (arr[j] < arr[minidx]) {
					minidx = j;

				}
			}
			int temp = arr[i];
			arr[i] = arr[minidx];
			arr[minidx] = temp;
		}

		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}