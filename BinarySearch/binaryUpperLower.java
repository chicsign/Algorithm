import java.util.Arrays;
import java.util.Scanner;

public class binaryUpperLower {

	private static int upper(int[] arr, int key) {
		// TODO Auto-generated method stub

		int first = 0;
		int last = arr.length - 1;

		int mid = 0;
		while (first < last) {

			mid = (first + last) / 2;

			if (arr[mid] <= key) {
				first = mid + 1;
			} else {
				last = mid;
			}

		}

		return last;

	}

	private static int lower(int[] arr, int key) {
		// TODO Auto-generated method stub

		int first = 0;
		int last = arr.length - 1;

		int mid = 0;
		while (first < last) {

			mid = (first + last) / 2;

			if (arr[mid] < key) {
				first = mid + 1;
			} else {
				last = mid;
			}

		}

		return last;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,3,5,7};

		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		System.out.println("upper key : " + key+ " / index "+upper(arr,key));
		System.out.println("lower key : " + key+ " / index "+ lower(arr,key));

	}

}
