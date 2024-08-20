package com.concepts.Array.dimentions;

import java.util.stream.IntStream;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		
		int[] arr= {2,3,1,4,2,6,4,7,8,9};
		
		System.out.println("Single Dimenstional Array: ");
		IntStream.of(arr).forEach(n ->System.out.print(" "+n));
		
		System.out.println("\nMinimum value: "+IntStream.of(arr).min().getAsInt());
		
		System.out.println("maximum value: "+IntStream.of(arr).max().getAsInt());
		
		System.out.println("Average value og Given Array: "+IntStream.of(arr).average().getAsDouble());
		
		System.out.println("Sum of all Array elements: "+IntStream.of(arr).sum());
		
		System.out.println("Length : "+IntStream.of(arr).count());
		
	}
}
