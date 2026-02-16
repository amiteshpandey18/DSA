package com.FrequencyCount;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();

		int arr[] = { 2, 4, 2, 6, 8, 6, 3, 3 };
		boolean visited[] = new boolean[arr.length];

		for (int i = 0; i <= arr.length - 1; i++) {
			if (visited[i] == true) {
				continue;
			}
			int count = 1;
			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}

				
			}
			System.out.println(arr[i] + "  " + count);
		}
	}
}