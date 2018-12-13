
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 5, 3, 8, 4, 9, 1, 6, 2, 7 };

		System.out.print("origin : ");
		print(data);

		quick_sort(data, 0, data.length - 1);

		System.out.print("result : ");

		print(data);

	}

	private static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
	}

	private static void quick_sort(int[] data, int l, int r) {
		// TODO Auto-generated method stub

		int left = l;
		int right = r;
		int pivot = data[(l + r) / 2];

		System.out.println("data pivot : " + pivot + " left : " + left + " right " + right);
		do {
			while (data[left] < pivot)
				left++;
			while (data[right] > pivot)
				right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}

		} while (left <= right);
		if (l < right)

			quick_sort(data, l, right);
		if (r > left)
			quick_sort(data, left, r);

	}

}
