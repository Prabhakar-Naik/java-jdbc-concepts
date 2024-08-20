package com.concept.datatypes;

import java.util.Arrays;

public class StringsPro {

	public static void main(String[] args) {
		
		
		// Store single value type data type
				String a="prabha",b="sudha",c="srinu";
				System.out.println(" Store single value type data type  "+a+" "+b+" "+c);
				
				//store multiple values type same data type
				//Array creation
				String arr[];
				
				//Array declaration
				arr=new String[5];
				
				//Array initialization
				//Arrays are index based starts from 0(zero)
				arr[0]="sameera";
				arr[1]="kalyani";
				arr[2]="jaya sri";
				arr[3]="jaya";
				arr[4]="sathwika";
				
				//Array Access using indexes...
				System.out.println("Approach 1 for printing: ");
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				System.out.println(arr[2]);
				System.out.println(arr[3]);
				System.out.println(arr[4]);
				
				System.out.println("Approach 2 for printing using for loop: ");
				
				for(int i=0;i<arr.length;i++)
					System.out.println(arr[i]);
				
				System.out.println("Approach 3 for printing using forEach loop: ");
				for(String ar:arr)
					System.out.println(ar);
				
				System.out.println("Appraoch 4 for printing using while loop: ");
				int i=0;
				while(i<arr.length)
				{
					System.out.println(arr[i]);
					i++;
				}
				
				// for copy 
				
				System.out.println("Approach 5 for printing using Streams from 1.8 version of java: ");
				Arrays.stream(arr).forEach(name ->System.out.println(name));

		
		
	}
}
