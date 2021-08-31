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
}
