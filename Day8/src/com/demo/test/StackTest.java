package com.demo.test;
import com.demo.service.*;
public class StackTest {
	public static void main(String[] args) {
		Stack ob = new Stack(5);
		ob.push(1);
		ob.push(3);
		ob.push(9);
		ob.push(5);
		ob.push(9);
		ob.push(5);
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
	}
	}
		
		