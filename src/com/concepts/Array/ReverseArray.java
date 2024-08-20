package com.concepts.Array;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr= {2,8,4,7,3,9,1};
		
		
		
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+"  ");
		
		
		System.out.println("\nwith using another array: ");
		int[] arr1=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
			arr1[i]=arr[i];
			
		
		for(int i=arr1.length-1;i>=0;i--)
			System.out.print(arr1[i]+"  ");
	}
}
