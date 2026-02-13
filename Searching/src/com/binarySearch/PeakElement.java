package com.binarySearch;
import java.util.*;

public class PeakElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Element");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(foundPeakElement(arr, n));

    }

    public static int foundPeakElement(int[] arr, int n) {

//		int left = 0;
//		int right = n - 1;
//
//		while (left < right) {
//			int mid = (left + right) / 2;
//
//			if (arr[mid] < arr[mid + 1]) {     //(log n)
//				left = mid + 1;
//			} else
//				right = mid;
//		}
//		return left;

            int left = 0;
            int right = n - 1;

            while (left < right) {
                int mid = (left + right) / 2;

                if (arr[mid] < arr[mid + 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            return left;
        }
    }
