package com.demo.test;

import java.util.stream.IntStream;

import com.demo.service.*;

public class Test1 {

	public static void main(String[] args) {
		ArrayService1 ob = new ArrayService1();
		System.out.println("Enter array Elements:");
		ob.acceptData();
		ob.displayData();
		int[] temp = ob.findSumRowWise();
		System.out.println("Addition Row Wise:");
		IntStream.of(temp).forEach(e -> System.out.print(e + ","));
		System.out.println("");
//		temp = ob.findSumColumnWise();
//		System.out.println("Addition Column Wise:");
//		IntStream.of(temp).forEach(e -> System.out.print(e + ","));
//		System.out.println();
//		ob.rowRotation(false, 1);
//		ob.displayData();
//		System.out.println();
//		ob.columnRotation(false, 1);
//		ob.displayData();

	}

}
