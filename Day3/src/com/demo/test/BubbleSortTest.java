package com.demo.test;

import java.util.stream.IntStream;

import com.demo.service.BubbleSort;

public class BubbleSortTest {

	public static void main(String[] args) {
		int[] arr = {10,4,7,8,9,4,2,65,9};
		BubbleSort.bubbleSortAscending(arr);
		System.out.println("------------------------------------------------");
		
		
		BubbleSort.bubbleSortDecending(arr);
		System.out.println("------------------------------------------------");
		
		
		BubbleSort.bubbleSortImproved(arr);
		IntStream.of(arr).forEach(e->System.out.print(e+"\t"));
		
	}

}
