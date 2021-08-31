package com.bridgelabz.linkedlist;

public class MyLinkedList {
	public static OperationsLL list = new OperationsLL();

	public static void main(String[] args) {
		System.out.println("Welcome to Single LinkedList!");
		list.addFirst(list, 56);
		list.addFirst(list, 30);
		list.addFirst(list, 70);
		list.displayNode(list);
	}
}
