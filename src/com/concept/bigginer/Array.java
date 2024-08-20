package com.concept.bigginer;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+arr.length+" elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Printing Array Elements: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
		
		System.out.println("\n Reverse order of Array elements: ");
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+"  ");
		
		sc.close();
		
	}
}
