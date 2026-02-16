package com.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertStringSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array is String");
		String str = sc.nextLine();

		str = str.replace("[", "").replace("]", "");

		String strArr[] = str.split(", ");
		int arr[] = new int[strArr.length];

		changeIntoArray(strArr, arr);
		insertionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	static void changeIntoArray(String str[], int[] arr) {

		for (int i = 0; i <= str.length - 1; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
	}

	static void insertionSort(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}