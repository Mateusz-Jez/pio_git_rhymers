package edu.kis.vh.nursery.list;

public class IntLinkedList {

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
// Wszystkie settery są używane

	private Node last;
	// TODO: zmienna nie jest używana
	private int i;

	// TODO: metoda nie jest używana
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

	// TODO: metoda zawsze zwraca 'false' oraz nie jest używana
	public boolean isFull() {
		return false;
	}

	// TODO: metoda nie jest używana
	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	// TODO: metoda nie jest używana
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
