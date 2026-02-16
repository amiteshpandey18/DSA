import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two String Array");
		String str1 = sc.nextLine(); // [2000,3000,25000]
		String str2 = sc.nextLine(); // [3500,2800,5000]

		str1 = str1.replace("[", "").replace("]", ""); // 2000,3000,25000
		str2 = str2.replace("[", "]").replace("]", ""); // 3500,2800,5000

		String[] strArr1 = str1.split(", "); // 2000|3000|25000|
		String[] strArr2 = str2.split(", "); // 3500|2800|5000

		int[] arr1 = new int[strArr1.length];
		int[] arr2 = new int[strArr2.length];

		int[] mergedArr = new int[arr1.length + arr2.length];

		convertIntoArray(strArr1, arr1);
		convertIntoArray(strArr2, arr2);

		mergedArr(mergedArr, arr1, arr2);
		bubbleSort(mergedArr);

		System.out.print("[");
		for (int i = 0; i <= mergedArr.length - 1; i++) {
			if (i < mergedArr.length - 1) {
				System.out.print(mergedArr[i] + ", ");
			} else {
				System.out.print(mergedArr[i]);
			}
		}

		System.out.println("]");

	}

	static void convertIntoArray(String[] strArr, int[] arr) {
		for (int i = 0; i <= strArr.length - 1; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		System.out.println("Converted to array");
	}

	static void mergedArr(int[] mergedArr, int[] arr1, int[] arr2) {
		for (int i = 0; i <= arr1.length - 1; i++) {
			mergedArr[i] = arr1[i];
		}
		System.out.println("Merged Array1");

		for (int i = 0; i <= arr2.length - 1; i++) {
			mergedArr[arr1.length + i] = arr2[i];
		}
		System.out.println("Merged Array2");

	}

	static void bubbleSort(int[] mergedArr) {
		for (int i = 0; i <= mergedArr.length - 2; i++) {
			for (int j = 0; j <= (mergedArr.length - 2 - i); j++) {
				if (mergedArr[j] > mergedArr[j + 1]) {
					int temp = mergedArr[j];
					mergedArr[j] = mergedArr[j + 1];
					mergedArr[j + 1] = temp;
				}
			}
		}
	}
}