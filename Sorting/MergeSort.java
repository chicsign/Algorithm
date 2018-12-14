
public class MergeSort {

	private static void mergeSort(int[] data, int left, int right) {
		// TODO Auto-generated method stub

		int mid;

		if (left < right) {

			mid = (left + right) / 2;

			mergeSort(data, left, mid);
			mergeSort(data, mid + 1, right);
			merge(data, left, mid, right);
		}

	}

	private static void merge(int[] data, int left, int mid, int right) {
		// TODO Auto-generated method stub

		int l = left; // 첫번째 부분 시작
		int m = mid + 1; // 두번째 부분 시작
		int k = left; // 배열 tempArr에 저장할 위치

		int[] tempArr = new int[data.length];

		while (l <= mid && m <= right) {

			if (data[l] < data[m]) {
				tempArr[k++] = data[l++];
			} else {
				tempArr[k++] = data[m++];
			}

		}

		while (l <= mid) {
			tempArr[k++] = data[l++];
		}

		while (m <= right) {
			tempArr[k++] = data[m++];
		}

		for (int index = left; index < k; index++) {
			data[index] = tempArr[index];
		}

		print(data);
	}

	private static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 6, 3, 3, 7, 1, 21, 3, 7, 2, 25 };

		System.out.print("origin :");
		print(data);
		mergeSort(data, 0, data.length - 1);

		System.out.print("result :");
		print(data);
	}

}
