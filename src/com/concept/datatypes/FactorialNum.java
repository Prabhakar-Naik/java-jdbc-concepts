package com.concept.datatypes;

public class FactorialNum {

	public static void main(String[] args) {
	
		for(int i=3;i<=8;i++)
		{
		int fact=1, n=i;
		for(int j=1;j<=n;j++)
		{
			fact=fact*j;
		}
		System.out.println(n+" factorial is "+fact);
	}
	}
}
