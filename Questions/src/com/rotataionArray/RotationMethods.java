package com.rotataionArray;

import java.util.Arrays;
import java.util.Scanner;

public class RotationMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of an Array");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter rotation time");
		int rot = sc.nextInt();

		remove(arr, rot);

		System.out.println(Arrays.toString(arr));

	}

	public static void rotate(int arr[], int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	private static void remove(int[] arr, int rot) {

		int n = arr.length;

		if (n < rot) {
			rot %= n;
		}
		rotate(arr, 0, n - 1);
		rotate(arr, 0, rot - 1);
		rotate(arr, rot, n - 1);

	}
}
