package com.TwoPointers;

public class IsPalindrome {

	public static void main(String[] args) {

		String str = "a man, a plan, a canal: Panama";
		String str1 = str.toLowerCase();
		System.out.println(str1);
		int j = 0;
		char[] strArr = new char[str1.length()];
		for (int i = 0; i <= str1.length() - 1; i++) {
			if (str1.charAt(i) <= 'z' && str1.charAt(i) >= 'a' && str1.charAt(i) != ' ') {
				strArr[j++] = str1.charAt(i);
			}
		}
		int left = 0;
		int right = j-1;
		boolean result = true;
		while (left <= right) {
			if (strArr[left] != strArr[right]) {
				result=false;
				break;
			} 
			left++;
			right--;
		}
		System.out.println(result);
	}
}