package com.demo.service;

public class Hashing {
	Node[] heads;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public Hashing() {
		heads = new Node[10];
		for (int i = 0; i < heads.length; i++) {
			heads[i] = null;
		}
	}

	public Hashing(int size) {
		heads = new Node[size];
		for (int i = 0; i < heads.length; i++) {
			heads[i] = null;
		}
	}

	public void insertData(int val) {
		Node newNode = new Node(val);
		int pos = val % heads.length;
		if (heads[pos] == null) {
			heads[pos] = newNode;
		} else {
			newNode.next = heads[pos];
			heads[pos] = newNode;
		}
	}

	public void displayHashing() {
		for(int i=0;i<heads.length;i++) {
			 Node temp = heads[i];
			 System.out.println(i+"--------->");
			 while(temp!=null) {
				 System.out.println(temp.data+"----------->");
				 temp=temp.next;
				
				 }
			 	System.out.println("Null");
			 
			 }
			
		}
	public boolean searchData(int val) {
		int pos = val%heads.length;
		Node temp = heads[pos];
		while(temp!=null) {
			if(temp.data==val) {
				System.out.println(val+"Found");
			}
			temp=temp.next;
		}
		System.out.println(val+"Not Found");
		return false;
	}

	

}
