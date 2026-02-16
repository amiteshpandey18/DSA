package com.BubbleSort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr1 = { 5, 3, 1, 4, 6 };
		int[] arr2 = { 4, 5, 2, 5, 7 };

		int[] marr = new int[arr1.length + arr2.length];

		for (int i = 0; i <= arr1.length - 1; i++) {
			marr[i] = arr1[i];
		}
		for (int i = 0; i <= arr2.length - 1; i++) {
			marr[arr1.length + i] = arr2[i];
		}

		for (int i = 0; i <= marr.length - 2; i++) {
			for (int j = 0; j <= (marr.length - 2 - i); j++) {
				if (marr[j] > marr[j + 1]) {
					int temp = marr[j];
					marr[j] = marr[j + 1];
					marr[j + 1] = temp;
				}

			}
		}

		System.out.println("Sorted Array: " + Arrays.toString(marr));
	}

}
