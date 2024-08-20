package com.concept.bigginer;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+arr.length+" Elements: ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Even Numbers only: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.print(arr[i]+"  ");
		}
		sc.close();
	}
}
