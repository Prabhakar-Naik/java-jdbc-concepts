package com.concepts.Array;

import java.util.Arrays;

public class ArraySort_0s_1s {

	public static void main(String[] args) {
		
		int[] arr= {0,1,0,0,1,1,1,0,0,1,1,0};
		
		int left=0;
		int right=arr.length-1;
		
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		while(left<right) {
			
			while(arr[left]==0 && left<right) 
				left++;
			
			while(arr[right]==1 && left<right)
				right--;
			
			if(left<right) {
				arr[left]=0;
				arr[right]=1;
				left++;
				right--;
			}
			
		}
		System.out.println("After sorting the 0s and 1s: ");
		for(int num:arr)
		{
			System.out.print("  "+num);
		}
		
		
		
	}
}
