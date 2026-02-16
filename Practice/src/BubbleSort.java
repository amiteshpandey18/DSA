import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 23, 44, 22, 8, 66, 22, 7, 2 };
		int n = 8;

		for (int i = 0; i <= n - 2; i++) {
			for (int j = 0; j <= (n - 2 - i); j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
