package com.linearSearch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter key for searching");
        int key = sc.nextInt();

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                System.out.println("Element found");
                return;
            }
        }

        System.out.println("Element not found");
    }
}