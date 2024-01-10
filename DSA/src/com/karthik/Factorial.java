package com.karthik;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Input value to count digit");
		  int input=sc.nextInt();
		  
		  
		  int res=factorialofNumber(input);
		  
		  System.out.println(res);

	}

	private static int factorialofNumber(int input) {
		// TODO Auto-generated method stub
		
		if(input==0) {
			return 1;
		}
		return input*factorialofNumber(input-1);
	}

}
