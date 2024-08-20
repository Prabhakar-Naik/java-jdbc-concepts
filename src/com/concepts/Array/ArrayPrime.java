package com.concepts.Array;

public class ArrayPrime {

	public static void main(String[] args) {
		
		int[] arr= {2,4,6,3,7,9,4,6,};
		int count=0,n=0;
		System.out.println("Prime Numbers in Array: ");
		for(int i=0;i<arr.length;i++) {
			
			n=arr[i];
			
			for(int j=1;j<=n;j++) {
				
				if(n%j==0)
					count++;
			}
			if(count==2)
				System.out.print(n+"  ");
			
			count=0;
		}
	}
}
