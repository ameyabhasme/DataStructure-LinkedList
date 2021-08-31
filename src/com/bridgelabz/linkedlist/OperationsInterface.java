package com.bridgelabz.linkedlist;

public interface OperationsInterface {

	public OperationsInterface addFirst(OperationsInterface list, int data);

	public void displayNode(OperationsInterface list);
	
	public OperationsInterface addLast(OperationsInterface list, int data);
	
	public OperationsInterface addAtNthPos(OperationsInterface list, int data, int pos);
	
	public void deleteFirst();
	
	public void deleteLast();

}
