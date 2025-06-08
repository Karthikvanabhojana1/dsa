package org.example;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);

		 System.out.println("Input value to count digit");
		  int a=sc.nextInt();
		  
		  boolean val=isprime(a);
		  if(val) {
			  System.out.println("Prime");
			  
		  }
		  else{
			  System.out.println(" not Prime");
		  }
	}
	  
	private static boolean isprime(int n) {
		//complexity 0(n-2)
		
		if(n==1)
			return false;
		for (int i=2;i*i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
}
