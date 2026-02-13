package com.binarySearch;

public class StringSort {

        public static void main(String[] args) {

            String str[] = { "Alice", "Bob", "Charley", "David", "Eva", "David" };
            String found = "Eva";

            int left = 0;
            int right = str.length-1;

            while (left < right) {

                int mid = (left + right) / 2;

                if (str[mid].equals(found)) {
                    System.out.println("Element found");
                    return;
                } else if (found.compareTo(str[mid]) < 0) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            }
        }
    }
