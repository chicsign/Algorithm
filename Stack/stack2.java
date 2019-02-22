package myStack;

import java.util.EmptyStackException;

class Stacks<Integer> {

	private int size = 5;

	private int[] arr;

	private int top;

	public Stacks() {
		arr = new int[size];
		top = 0;
	}

	public void push(int n) {

		if (top >= size) {
			throw new StackOverflowError();
		}

		arr[top++] = n;
	}

	public int pop() {

		if (top <= 0) {
			throw new EmptyStackException();
		}

		return arr[--top];
	}
}

public class myStack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stacks<Integer> st = new Stacks<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
//		st.push(6); // stack over flow error

		for (int i = 0; i < 5; i++) {
			System.out.println(st.pop());
		}

	}

}
