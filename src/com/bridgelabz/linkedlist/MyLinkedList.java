package com.bridgelabz.linkedlist;

public class MyLinkedList {
	public static OperationsLL list = new OperationsLL();

	public static void main(String[] args) {
		System.out.println("Welcome to Single LinkedList!");
		list.addFirst(list, 56);
		list.addLast(list, 70);
		list.addAtNthPos(list, 30, 2);
		list.displayNode(list);
		list.searchElement(30);
	}
}
