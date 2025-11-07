package com.demo.service;

public class QueueService {
	Node front;
	Node rear;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;

		}
	}
	 public QueueService() {
		 front= null;
		 rear=null;
	}
	 
	public boolean isEmpty() {
		return front==null&&rear==null;
	}
	
	public void enQueue(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			front = newNode;
		}
		else {
			rear.next = newNode;
		}
		rear= newNode;
		System.out.println("Added" +val);
	}
	public int deQueue() {
		Node temp= null;
		if(!isEmpty()) {
			temp= front;
			front = front.next;	
			if(front==null) {
				rear=null;
			}
			temp.next = null;
			return temp.data;
		}
		else {
			System.out.println("Queue Is Empty");
			return -1;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
