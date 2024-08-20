package org.example;

import java.util.Scanner;

public class GCDorHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);

		 System.out.println("Input value to count digit");
		  int a=sc.nextInt();
		  
		  int b=sc.nextInt();

		  
		  int res=gcd(a,b);
		  
		  System.out.println(res);
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		
		if(b==0) {
			return a;
		}
		else 
			return gcd(b,a%b);
	}

}
