package com.demo.service;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayService {
	private int[][] arr;
	
	public TwoDArrayService() {
		arr = new int[3][3];
	}
	
	public TwoDArrayService(int rows,int colm) {
		arr= new int[rows][colm];
		
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter Row " + i + " " + "Column" + " " + j);
				arr[i][j] = sc.nextInt();
			}
		}
	}

	public void displayData() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------");
	}

	public int[] findSumRowWise() {
		// TODO Auto-generated method stub
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j)
				
				
				
				
				
//		}
		return null;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


















