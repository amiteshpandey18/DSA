package com.linearSearch;
import java.util.*;


public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of names");
        int n = sc.nextInt();

        String str[] = new String[n];

        System.out.println("Enter names");

        for (int i = 0; i <= str.length - 1; i++) {
            str[i] = sc.next();
        }

        System.out.println("Enter names for found");

        String name = sc.next();

        for (int i = 0; i <= str.length - 1; i++) {
            if (name.equals(str[i])) {
                System.out.println("Name Found");
                return;
            }
        }
        System.out.println("Names not found");


    }
}
