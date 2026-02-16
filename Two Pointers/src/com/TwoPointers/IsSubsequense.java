package com.TwoPointers;

public class IsSubsequense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String t = "ahbgdc";

		System.out.println(subString(s, t));
	}

	public static boolean subString(String s, String t) {

		int sp = 0;
		int tp = 0;

		while (sp < s.length() && tp < t.length()) {

			if (s.charAt(sp) == t.charAt(tp)) {
				sp++;
			}
			tp++;
		}
		return sp == s.length();
	}
}