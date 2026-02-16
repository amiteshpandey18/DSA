package com.practiceQuestions;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalam";

		int i = 0;
		int j = str.length() - 1;
		boolean isPalindrome = false;

		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				isPalindrome = false;
				break;
			}

			isPalindrome = true;
			i++;
			j--;
		}

		if (isPalindrome == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrme");
		}
	}
}