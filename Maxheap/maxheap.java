package heap;

public class maxheap {

	private int[] heap;
	private int heapsize;
	private int maxsize;

	public maxheap(int maxsize) {
		this.maxsize = maxsize;
		this.heapsize = 0;
		heap = new int[maxsize + 1];
		heap[0] = Integer.MAX_VALUE; // 힙에 0번째 배열은 사용하지 않는다.

	}

	public void delete() {

		System.out.println("Max value : " + heap[1]);
		
		heap[1] = heap[this.heapsize];
		heap[this.heapsize] = 0;
		

		for (int i = 1; i <this.heapsize ; i++) {

			if (heap[i] < heap[i * 2]) {
				swap(i, i * 2);
			} else {
				break;
			}
		}
	}

	public void insert(int num) {

		heap[++heapsize] = num;

		for (int i = this.heapsize; i > 1; i /= 2) {

			if (heap[i] > heap[i / 2]) {
				swap(i, i / 2);
			} else {
				break;
			}
		}
	}

	private void swap(int child, int parent) {
		// TODO Auto-generated method stub

		int temp = heap[parent];
		heap[parent] = heap[child];
		heap[child] = temp;

	}

	private void print() {

		for (int i = 1; i <= this.heapsize / 2; i++) {
			System.out.print(
					" Parent : " + heap[i] + " left : " + heap[2 * i] + " right :" + heap[2 * i + 1]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maxheap heap = new maxheap(15);

		heap.insert(9);
		heap.insert(7);
		heap.insert(6);
		heap.insert(5);
		heap.insert(4);
		heap.insert(3);
		heap.insert(2);
		heap.insert(2);
		heap.insert(1);
		heap.insert(3);

		heap.print();
		
		heap.delete();

		heap.print();
	}

}
