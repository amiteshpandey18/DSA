
public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int key = 60;
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right) / 2;

		while (left <= right) {

			if (arr[mid] == key) {
				System.out.println("Element found");
				return;
			} else if (key > arr[mid]) {
				left = mid + 1;
			} else if (key < arr[mid]) {
				right = mid - 1;
			}
			mid=(left+right)/2;
		}

	}

}
