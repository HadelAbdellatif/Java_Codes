package com.sun;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		   Scanner scan = new Scanner(System.in);
	        int num = scan.nextInt();
	        int digit = scan.nextInt();
	        
	        switch(digit) {
	        case 4:
	        	num/=10;
        		System.out.println("case 4: "+num);
	        case 3:
	        	num/=10;
	        	System.out.println("case 3: "+num);
	        case 2:
	        	num/=10;
	        	System.out.println("case 2: "+num);
	        case 1:
	        	System.out.println("case 1: "+num);
	        	
	        	break;
	        	default: 
	        		System.out.println("Invaled input");
	        
	        }
	        
	        if(num>0 && num<10) {
        		System.out.println("num "+num);
        		System.out.println("There is a match.");
	        }

	        else {
        		System.out.println("num "+num);
        		System.out.println("There isn't a match.");
	        }

	}

}
