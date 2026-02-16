package com.RemoveElement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter element for remove");
		int val = sc.nextInt();
		int length = removeElement(arr, val);

		for (int i = 0; i <= length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int removeElement(int[] arr, int val) {

		int index = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] != val) {
				arr[index++] = arr[i];
			}
		}
		return index;
	}

}
