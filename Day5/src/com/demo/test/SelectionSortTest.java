package com.demo.test;

import com.demo.service.SelectionSort;

public class SelectionSortTest {
	public static void main(String[] args) {
		int[] arr = {12,5,6,8,2,4,98,7};
		SelectionSort.SelectionSortAscending(arr);
		System.out.println("---------------------------------");
		SelectionSort.SelectionSortDecending(arr);
	
	}

}
