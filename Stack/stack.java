package myStack;

import java.util.EmptyStackException;

class Stack<T> {

	private int size;
	private int count = 0;

	class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> top;

	public Stack(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
	}

	public T pop() {
		if (top == null) {
			throw new EmptyStackException();
		}

		T item = top.data;
		top = top.next;

		return item;
	}

	public void push(T item) {
		
		if(count >= size)
			throw new StackOverflowError();

		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
		count++;

	}

	public T peek() {

		if (top == null)
			throw new EmptyStackException();

		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}
}

public class myStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<Integer>(5);

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
//		s.push(6);

		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}
