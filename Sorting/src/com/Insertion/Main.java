package com.Insertion;

public class Main {

	public static void main(String[] args) {

		int[] arr = { 5, 2, 9, 1, 5, 6 };

		System.out.println("Before Sorting:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		insertionSort(arr);

		System.out.println("\nAfter Sorting:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int key = arr[i]; // current element to be inserted
			int j = i - 1;

			// Move elements greater than key to one position ahead
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			// Insert the key at correct position
			arr[j + 1] = key;
		}
	}
}
