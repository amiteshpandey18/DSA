package com.practiceQuestions;

public class ReverseStringSpace {

	public static void main(String[] args) {

		// Reverse String Preserving White Space ---------------------------------

		String str = "Hi how are you";
		char[] strArr = str.toCharArray();
		System.out.println(twoPointer(strArr));
	}

	public static String twoPointer(char[] cArr) {

		int left = 0;
		int right = cArr.length - 1;

		while (left <= right) {
			if (cArr[left] == ' ') {
				left++;
			} else if (cArr[right] == ' ') {
				right--;
			} else {
				char temp = cArr[left];
				cArr[left] = cArr[right];
				cArr[right] = temp;

				left++;
				right--;
			}
		}
		String s = new String(cArr);
		return s;
	}
}