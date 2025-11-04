package com.demo.service;

import java.util.Arrays;

public class BubbleSort {
	
	// Ascending Order 
	public static void bubbleSortAscending(int[] arr) { 
		for(int i=0;i<arr.length;i++) { //   for No.of Iteration
			for (int j=1;j<arr.length-i;j++) { //  for No.of Comparison
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j]; //swap
					arr[j]=temp;
				}
				
			}
			System.out.println("Iteration: "+i);
			System.out.println(Arrays.toString(arr));
		}
	}
	//Descending Order
	public static void bubbleSortDecending(int[] arr) { 
		for(int i=0;i<arr.length;i++) { 
			for (int j=1;j<arr.length-i;j++) {
				if(arr[j-1]<arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.println("Iteration: "+i);
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void bubbleSortImproved(int[] arr) { 
		
		for(int i =0;i<arr.length;i++) {
			boolean flag = false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					flag=true;
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
//				System.out.println("Iteration: "+i);
//				System.out.println(Arrays.toString(arr));
			}
			if(!flag);
			break;
			
		}
	}


}
