package com.demo.test;
import com.demo.service.*;

public class QueueTest {
	public static void main(String[] args) {
		Queue ob = new Queue();
		ob.enQueue(6);
		ob.enQueue(9);
		ob.enQueue(6);
		ob.enQueue(8);
		ob.enQueue(4);
		ob.enQueue(5);
		System.out.println(ob.deQueue());
		System.out.println(ob.deQueue());
		System.out.println(ob.deQueue());
		System.out.println(ob.deQueue());
		System.out.println(ob.deQueue());
		System.out.println(ob.deQueue());
		System.out.println(ob.deQueue());
		System.out.println(ob.deQueue());
		
		
		
	}

}
