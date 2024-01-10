package com.karthik;

import java.util.Scanner;

public class BinaryExponentiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc=new Scanner(System.in);


		 System.out.println("Input value to count digit");
		  int a=sc.nextInt();
		  
		  int b=sc.nextInt();

		  
		  int res=powerBinary(a,b);
		  
		  System.out.println(res);
	
	}

	private static int powerBinary(int a, int b) {
		// TODO Auto-generated method stub
		int res=1;
		
		
		while(b>0) {
			if(b%2!=0) {
				res=res*a;
			}
			a=a*a;
			b=b/2;
		}
		
		return res;
		
	}

}
