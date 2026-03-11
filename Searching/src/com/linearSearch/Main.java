package com.linearSearch;

public class Main {
    public static void main(String[] args) {

        int[] arr = {12, 5, 7, 9, 15, 8};

        int found = 7;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == found) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not found");
    }
}