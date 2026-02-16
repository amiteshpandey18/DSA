package com.rotataionArray;

import java.util.Scanner;

public class RotationUserLeft {

	public static void main(String[] args) {

		// Rotate taking user input at left side

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter Elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter rotation time");
		int n = sc.nextInt();
		
		
		
		for (int i = 1; i <= n; i++) {
			int temp = arr[0];
			for (int j = 0; j <= arr.length-2; j++) {
				arr[j] = arr[j + 1];
			}

			arr[arr.length - 1] = temp;
		}

		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}