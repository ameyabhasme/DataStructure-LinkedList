package com.bridgelabz.linkedlist;

public class MyLinkedList {
	public static OperationsLL list = new OperationsLL();

	public static void main(String[] args) {
		System.out.println("Welcome to Single LinkedList!");
		list.addLast(list, 56);
		list.addLast(list, 30);
		list.addLast(list, 70);
		list.displayNode(list);
	}
}
