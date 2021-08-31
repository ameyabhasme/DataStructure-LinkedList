package com.bridgelabz.linkedlist;

public class OperationsLL implements OperationsInterface {
	Node head;

	@Override
	public OperationsInterface addFirst(OperationsInterface list, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		return list;
	}

	@Override
	public void displayNode(OperationsInterface list) {
		if (head == null) {
			System.out.println("Empty List");
		} else {
			Node temp;
			for (temp = head; temp.next != null; temp = temp.next) {
				System.out.print(temp.data + " => ");
			}
			System.out.print(temp.data);
			System.out.println("\n");
		}
	}

	@Override
	public OperationsInterface addLast(OperationsInterface list, int data) {
		Node newNode = new Node(data);
		Node temp = head;
		if (head == null) {
			head = newNode;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return list;
	}

	@Override
	public OperationsInterface addAtNthPos(OperationsInterface list, int data, int pos) {
		Node newNode = new Node(data);
		int counter = 1;
		if (head == null) {
			head = newNode;
		} else if (counter <= pos) {
			Node temp = head;
			while (temp.next != null && counter < pos - 1) {
				counter++;
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		return list;
	}

	@Override
	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is Empty.");
		} else {
			Node temp = head;
			head = temp.next;
			temp.next = null;
		}
	}

	@Override
	public void deleteLast() {
		if (head == null) {
			System.out.println("List is Empty.");
		} else {
			Node last = head;
			Node temp = head;
			while (temp.next != null) {
				last = temp;
				temp = temp.next;
			}
			last.next = null;
		}
	}
}
