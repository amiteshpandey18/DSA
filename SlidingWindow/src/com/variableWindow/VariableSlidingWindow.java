package com.variableWindow;

public class VariableSlidingWindow {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 1, 2, 4, 3 };

		int left = 0;
		int target = 7;
		int winSum = 0;
		int minLen = Integer.MAX_VALUE;

		for (int right = 0; right <= arr.length - 1; right++) {

			winSum = winSum + arr[right];

			while (target <= winSum) {
				int winSize = (right - left) + 1;
				if (winSize < minLen) {
					minLen = winSize;
				}
				winSum = winSum - arr[left];
				left++;
			}
		}
		System.out.println(minLen);
	}
}