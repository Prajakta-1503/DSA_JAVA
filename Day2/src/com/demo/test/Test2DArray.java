package com.demo.test;

import java.util.stream.IntStream;

import com.demo.service.*;

public class Test2DArray {

	public static void main(String[] args) {
		TwoDArrayService ob = new TwoDArrayService();
		System.out.println("Enter array Elements:");
		ob.acceptData();
		ob.displayData();
		
		int[] temp = ob.findSumRowWise();
		System.out.println("Addition Row Wise:");
		IntStream.of(temp).forEach(e -> System.out.print(e + ","));
		System.out.println("");
		
	}

}
