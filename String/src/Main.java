import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of an array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		int rotArr[] = new int[size];

		System.out.println("Enter Elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter rotation time");

		int time = sc.nextInt();

		for (int i = 0; i < time; i++) {
			int temp = arr[0];
			for (int j = 0; j <= arr.length - 2; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}

		System.out.println(Arrays.toString(arr));

//
//		int temp = arr[arr.length - 1];
//		for (int i = 0; i <= rotArr.length - 2; i++) {
//			rotArr[i + 1] = arr[i];
//		}
//
//		rotArr[0] = temp;
//
//		System.out.println(Arrays.toString(rotArr));
	}
}