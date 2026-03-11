package com.binarySearch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Binary Search works in Sorted Array.

        int[] arr = {12, 5, 7, 9, 15, 8};
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int key = 15;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (key == arr[mid]) {
                System.out.println("Found");
                return;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Not found");
    }
}