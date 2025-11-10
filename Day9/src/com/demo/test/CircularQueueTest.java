package com.demo.test;
import com.demo.service.*;

public class CircularQueueTest {

	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(4);
		queue.enQueue(3);
		queue.enQueue(6);
		queue.enQueue(4);
		queue.enQueue(8);
		queue.enQueue(3);
		queue.enQueue(9);
		queue.enQueue(1);
		System.out.println(queue. deQueue ());
		System.out.println(queue. deQueue ());
		System.out.println(queue. deQueue ());
		System.out.println(queue. deQueue ());
		System.out.println(queue. deQueue ());
		System.out.println(queue. deQueue ());
		
		
		
	}

}
