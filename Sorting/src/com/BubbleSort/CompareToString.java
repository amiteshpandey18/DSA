package com.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class CompareToString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String str1 = "java";
		String str2 = "python";

		System.out.println(str1.compareTo(str2));

		String str3 = "java";
		String str4 = "java";

		System.out.println(str3.compareTo(str4));

		String str5 = "java";
		String str6 = "javb";
		System.out.println(str5.compareTo(str6));
                                                                                                                                                                                                                                                                 
		String str7 = "java";
		String str8 = "javaaaaa";

		System.out.println(str7.compareTo(str8));

		if (str1.compareTo(str2) > 0) {
			System.out.println("Str1 is greater");

		} else if (str1.compareTo(str2) < 0) {
			System.out.println("Str2 is greater");
		} else {
			System.out.println("Both are equal");
		}
		
		String str[] = new String[5];
		
		System.out.println("Enter String");
		
		for(int i=0;i<=str.length-1;i++) {
			str[i] = sc.next();
		}
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=(5-2-i);j++) {
				if (str[j].compareTo(str[j+1]) > 0) {
					String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
				} 
			}
		}
		
		System.out.println(Arrays.toString(str));
	}
}