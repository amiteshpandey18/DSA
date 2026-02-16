package com.practiceQuestions;

import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(subString(str));

	}

	public static String subString(String str) {
		String subString = "";
		String largestSubstring = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				subString = str.substring(i, j);
				boolean val = palindrome(str.substring(i, j));

				if (val == true) {
					if (subString.length() > largestSubstring.length()) {
						largestSubstring = subString;
					}
				}
			}
		}

		return largestSubstring;
	}

	public static boolean palindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}