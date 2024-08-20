package com.concept.datatypes;

public class perfectNum {

	public static void main(String[] args) {
		
		int n=1000,sum=0;
		
		 for(int i = 1; i < n; i++)
	        {
			 int num=i;
			 //System.out.println(num+" factors are: ");
			 for(int j=1;j<num;j++) {
				 
	            if(num % j == 0)
	            {
	            	//System.out.print(j+"  ");
	                sum = sum + j;
	            }
	        }
			// System.out.println();
	        if(sum == num)
	        {
	            System.out.println("====>"+num+" is Perfect");
	        }
	        sum=0;
	    }
	}
}
