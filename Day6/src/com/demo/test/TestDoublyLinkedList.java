package com.demo.test;

import com.demo.service.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dlist=new DoublyLinkedList();
		dlist.addNode(12);
		dlist.addNode(15);
		dlist.addNode(13);
		dlist.displayData();
		
//		dlist.addByPosition(1, 15);
//		System.out.println();
//		dlist.displayData();
		
		dlist.addByValue( 13);
		System.out.println();
		dlist.displayData();
		 
//		dlist.deleteByPosition(2);
//		System.out.println();
//		dlist.displayData();
//		
//		dlist.deleteByValue(12);
//		System.out.println();
//		dlist.displayData();

	}

}
