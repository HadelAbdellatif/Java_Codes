package com.sun;

import java.util.Scanner;

class Question4 {

	public static void main(String[] args) {
		
		int i=0,grade, sum=0, count60=0,max=0;
		double avg=0;
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter 5 grades") ;
		for (i=1; i<=5;i++) {
			grade = scanner.nextInt();
		   if (grade>=0&&grade<=100){
			   sum=sum+grade;
		   }
		   if(grade>max)
		      max=grade;
		   if(grade<60)
		      count60++;  
	       if(grade<0 && grade>100)
		   {
			System.out.println("not legal grade try ...");
			i--;
		   }  
		}
		
		avg = (double)sum/5.0;
		System.out.println("average is: "+avg);
		System.out.println(count60 +" grades under 60");
	}

}
