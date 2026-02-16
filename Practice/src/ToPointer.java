import java.util.*;

public class ToPointer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		int[] x = (sorting(arr));

		System.out.print("[");
		for (int i = 0; i <= x.length - 1; i++) {
			if (i < x.length - 1) {
				System.out.print(x[i] + ", ");
			} else {
				System.out.print(x[i]);
			}
		}
		System.out.println("]");

		toPointer(x);
	}

	public static int[] sorting(int arr[]) {

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void toPointer(int[] arr) {

		Scanner sc = new Scanner(System.in);
		int left = 0;
		int right = arr.length - 1;

		System.out.println("Enter element for searching");
		int element = sc.nextInt();
		int iterator = 0;

		while (left <= right) {
			iterator++;
			if (arr[left] == element || arr[right] == element) {
				System.out.println("Element found at iterator " + iterator);
				break;
			}
			left++;
			right--;
		}
	}
}