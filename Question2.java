package com.sun;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        int k = 1;
        
        for(; num!=0 ; num=num/10) {
        	System.out.println("num = "+num);
        	System.out.println("num%10 " +num%10);
        	System.out.println("num%10%2 " +num%10%2);
        	if(num%10%2 == 0) {
        		sum += k*(num%10 + 1);
            	System.out.println("sum1 = "+sum);
        	}
        	else {
        		sum += k+(num%10 - 1);
            	System.out.println("sum2 = "+sum);
        	}
        	k*=10;
        		
        }
    	System.out.println("sum3 = "+sum);

	}

}
