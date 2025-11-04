package com.demo.test;

import com.demo.service.QuickSort;

public class QuickSortTest {
	public static void main(String[] args) {
		int[] arr = {12,4,7,9,4,14,46,4};
		QuickSort.quickSort(arr, 0, arr.length-1);
		
	}
	

}
