package com.demo.service;

import java.util.Arrays;

public class ArrayService {
	private int []arr;
	private int count;
	
	public ArrayService() {
		arr = new int[10];
		count = 0;
	}
	public ArrayService(int [] arr,int count) {
		this.arr=arr;
		this.count=count;
	}
	public ArrayService( int size) {
		arr= new int[size];
		count=0;
		
	}
	public int getCapacity() {
		return arr.length;
	}
	
	public int getSize() {
		return count;
	}
	
	public boolean add(int x) {
		if(count<arr.length) {
			arr[count]=x;
			count ++;
			return true;
		}
		return false;
	}
	
	public boolean add(int val ,int pos) {
		if(count<arr.length && count>pos) {
			for (int i=count;i>pos;i--) {
				arr[i]=arr[i-1];
			}
			arr[pos]=val;
			count++;
			return true;
		}
		return false;
	}
	public boolean delete(int pos) {
		if(count>pos) {
			for(int i=pos;i<count-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[count-1]=0;
			count--;
			return true;
			
		}return false;
	}
	public int searchByValue(int value) {
		for(int i=0; i<count;i++) {
			if(arr[i]==value) {
				return i;
			}
		}return -1;
	}
	
	public boolean delete(int value) {
		int index = searchByValue(int value){
			i
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "ArrayService [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
