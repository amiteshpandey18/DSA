package com.BubbleSort;
import java.util.*;

public class StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String str[] = new String[n];

		System.out.println("Enter Arrays");

		for (int i = 0; i <= str.length - 1; i++) {
			str[i] = sc.next();
		}

		System.out.println("Orignal Ayyay: " + Arrays.toString(str));

		for (int i = 0; i <= n - 2; i++) {
			for (int j = 0; j <= (n - 2 - i); j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
					String temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(str));
	}
}