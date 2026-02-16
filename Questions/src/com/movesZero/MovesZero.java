package com.movesZero;

import java.util.Arrays;

public class MovesZero {

	public static void main(String[] args) {

		int arr[] = { 3, 0, 6, 2, 0, 5, 1 };
		System.out.println(Arrays.toString(arr));

		moves(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void moves(int[] arr) {
		int j = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] != 0) {
				arr[j++] = arr[i];
			}
		}

		while (j < arr.length) {
			arr[j++] = 0;
		}
	}
}