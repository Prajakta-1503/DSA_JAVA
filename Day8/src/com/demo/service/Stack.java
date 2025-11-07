package com.demo.service;

public class Stack {
	private int[] arr;
	private int top;
	
	public Stack() {
		arr= new int[10];
		top=-1;	
	}
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}
	public void push (int num) {
		if(!isFull()) {
			top++;
			arr[top]=num;
			System.out.println("Pushed"+num);	
		}else {
			System.out.println("Stack is full");
		}
	}
	public int pop( ) {
		if(!isEmpty()) {
			int num = arr[top];
			top--;
			return num;
		}else {
			System.out.println("Stack is Empty!!");
			return  -1;
		}
	}
	private boolean isEmpty() {
		return top==-1;
	}
	private boolean isFull() {
		
		return top==arr.length-1;
	}
	

}
