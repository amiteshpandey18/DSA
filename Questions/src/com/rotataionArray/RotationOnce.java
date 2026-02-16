package com.rotataionArray;

import java.util.*;

public class RotationOnce {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int rotArr[] = new int[size];

		System.out.println("ENter Elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		int temp = arr[arr.length - 1];
		for (int i = rotArr.length - 1; i > 0; i--) {
			rotArr[i] = arr[i - 1];
		}

		rotArr[0] = temp;

		for (int x : rotArr) {
			System.out.print(x + " ");
		}
	}
}