package permutaion;

public class Main {

	static void swap(int[] arr, int i, int j) {

		int temp;

		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void perm(int[] arr, int depth, int n, int k) {

		if (depth == k) {
			print(arr, k);
			return;
		}

		for (int i = depth; i < n; i++) {
			swap(arr, i, depth);
			perm(arr, depth + 1, n, k);
			swap(arr, i, depth);
		}

	}

	public static void print(int[] arr, int k) {
		for (int i = 0; i < k; i++) {
			if (i == k - 1)
				System.out.println(arr[i]);
			else
				System.out.print(arr[i] + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5 };

		perm(arr, 0, 5, 5); // n개 중 k개로 이루어진 순열

	}

}
