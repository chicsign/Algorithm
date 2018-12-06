import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

	private static int binarySearch(int[] arr, int key) {
		// TODO Auto-generated method stub

		int first = 0;
		int last = arr.length - 1;

		while (first <= last) {

			int mid = (first + last) / 2;

			if (key == arr[mid]) {
				return mid;
			} else {

				if (key < arr[mid]) {
					last = mid - 1;
				} else {
					first = mid + 1;
				}

			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 4, 2, 5, 7, 9, 11, 17, 3 };

		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();

		Arrays.sort(arr);

		int result = binarySearch(arr, key);
		
		if(result != -1) {
			System.out.println("find!");
		}else {
			System.out.println("no item");
		}
	}

}
