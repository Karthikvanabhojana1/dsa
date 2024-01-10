package com.karthik;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);

		 System.out.println("Input value to count digit");
		  int a=sc.nextInt();
		  
		  int b=sc.nextInt();

		  
		  int res=lcm(a,b);
		  
		  System.out.println(res);
	}

	private static int lcm(int a, int b) {
		// TODO Auto-generated method stub
		return (a*b)/gcd(a, b);
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
