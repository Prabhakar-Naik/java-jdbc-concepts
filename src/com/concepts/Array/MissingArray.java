package com.concepts.Array;

public class MissingArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,5,6,7,8,9};
		int sum=0,totalsum=(arr.length+1)*(arr.length+2)/2;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		
		int misnum=totalsum-sum;
		System.out.println("Missing Number: "+misnum);
		
		
	}
}
