package com.binarySearch;
import java.util.*;


public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Enter key for search");
        int key = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) {

            if (key == arr[mid]) {
                System.out.println("Element found");
                return;
            } else if (key < arr[mid]) {
                right = mid - 1;
            }

            else if (key > arr[mid]) {
                left = mid + 1;
                mid = (left + right) / 2;
            }
        }
        System.out.println("Elemnet not found");
    }
}
