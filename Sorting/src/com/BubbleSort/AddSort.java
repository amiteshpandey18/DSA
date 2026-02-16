package com.BubbleSort;

import java.util.Scanner;

public class AddSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		str1 = str1.replace("[", "").replace("]", "");// 3000,2000,4000
		str2 = str2.replace("[", "").replace("]", "");// 4500,3500,2500

		String[] strArr1 = str1.split(", "); // 3000|2000|4000
		String[] strArr2 = str2.split(", "); // 4500|3500|2500

		int arr1[] = new int[strArr1.length];
		int arr2[] = new int[strArr2.length];

		int sumArr[] = new int[strArr1.length];
		changeIntoArray(strArr1, arr1);
		changeIntoArray(strArr2, arr2);

		sumArray(arr1, arr2, sumArr);

		bubbleSort(sumArr);

		System.out.print("[");
		for (int i = 0; i <= sumArr.length - 1; i++) {
			if (i < sumArr.length - 1) {
				System.out.print(sumArr[i] + ", ");
			} else {
				System.out.print(sumArr[i]);
			}
		}
		System.out.println("]");
	}

	static void changeIntoArray(String[] str, int arr[]) {

		for (int i = 0; i <= str.length - 1; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
	}

	static void sumArray(int[] arr1, int arr2[], int[] sumArr) {
		for (int i = 0; i <= sumArr.length - 1; i++) {
			sumArr[i] = arr1[i] + arr2[i];
		}
	}

	static void bubbleSort(int[] sumArr) {
		for (int i = 0; i <= sumArr.length - 2; i++) {
			for (int j = 0; j <= sumArr.length - 2 - i; j++) {
				if (sumArr[j] > sumArr[j + 1]) {
					int temp = sumArr[j];
					sumArr[j] = sumArr[j + 1];
					sumArr[j + 1] = temp;
				}
			}
		}
	}
}