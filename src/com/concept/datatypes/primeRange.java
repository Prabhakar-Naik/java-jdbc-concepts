package com.concept.datatypes;

public class primeRange {

	public static void main(String[] args) {
		
		for(int i=10;i<=50;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+"  ");
			count=0;
		}
		
	}
}
