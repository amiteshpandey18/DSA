import java.util.*;

public class MergeBubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Array size");
		int n1 = sc.nextInt();
		int[] arr = new int[n1];
		System.out.println("Enter Array1 elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter 2nd Array size");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter Array1 elements");
		for (int i = 0; i <= arr2.length - 1; i++) {
			arr2[i] = sc.nextInt();
		}

		int mergArr[] = new int[arr.length + arr2.length];

		int[] res = mergedArrray(arr, arr2, mergArr);

		System.out.println("Merged Array: " + Arrays.toString(res));

		bubbleSort(mergArr);
		sc.close();

	}

	static int[] mergedArrray(int[] arr, int[] arr2, int[] mergArr) {

		for (int i = 0; i <= arr.length - 1; i++) {
			mergArr[i] = arr[i];
		}

		for (int i = 0; i <= arr2.length - 1; i++) {
			mergArr[arr.length + i] = arr2[i];
		}

		return mergArr;
	}

	static void bubbleSort(int[] mergArr) {

		for (int i = 0; i <= (mergArr.length - 2); i++) {
			for (int j = 0; j <= mergArr.length - 2 - i; j++) {

				if (mergArr[j] > mergArr[j + 1]) {
					int temp = mergArr[j];
					mergArr[j] = mergArr[j + 1];
					mergArr[j + 1] = temp;
				}

			}
		}
		System.out.println("Sorted Merge Array is: " + Arrays.toString(mergArr));
	}

}