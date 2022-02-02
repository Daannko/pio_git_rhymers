package edu.kis.vh.nursery.list;

//TODO: cała klasa nie jest używana. możliwe usuniecie
public class IntLinkedList {

	//TODO: Klasa node może być statyczna
	private class Node {

		private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			setValue(i);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	private Node last;
	//TODO: NIeuzywana zmienna i, możliwe usunięcie.
	private int i;

	//TODO: metoda push nie jest nigdy użyta, możliwe usunięcie.
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	//TODO: metody isFull,top,pop nigdy nie użyawne, możliwe całkowite usunięcie.
	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
