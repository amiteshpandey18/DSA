package com.ReverseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter Elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		reverse(arr);

	}

	public static void reverse(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		
			while (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
