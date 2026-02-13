package com.binarySearch;

public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90}; // Sorted Array

        int key = 80;

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            int mid = (left + right) / 2;
            if(arr[mid]==key) {
                System.out.println("Element found");
                return;
            } else if(arr[mid] > key) {
                right--;
            }
            left++;

        }
        System.out.println("Element not found");
    }
}
