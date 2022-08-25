package com.hubberspot.DataStuctures.analysis;

import com.hubberspot.DataStuctures.analysis.TimeComplexity;

public class TimeComplexity {

	public static void main(String[] args) {
		double now =System.currentTimeMillis();
		
		TimeComplexity obj=new TimeComplexity();
		System.out.println(obj.findSum(99999));
		
		
		System.out.println("Time taken - "+(System.currentTimeMillis()-now)+"millisecs");
	}


   public int findSum(int n) {
	return n*(n+1)/2;
   }

   /*public int findSum(int n) {
	int sum=0;
	for(int i=0;i<=a;i++) {
		sum=sum+i;	
	}
	return sum;
}
}*/
}
