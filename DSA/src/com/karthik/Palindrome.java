package com.karthik;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc=new Scanner(System.in);

		 System.out.println("Input value to count digit");
		  int input=sc.nextInt();
		  
		  
		  boolean res=ispalindrome(input);
		  if(res) {
			  System.out.println(input+" Is a Palindrome");
		  }
		  else {
			  System.out.println(input+" Is a not a palindrome");

		  }
		  
	}

	private static boolean ispalindrome(int input) {
		// TODO Auto-generated method stub
		int rem=0;
		int temp=input;
		int res=0;
		while(temp!=0) {
			rem=temp%10;
			temp=temp/10;
			res=(res*10)+rem;
		}
		System.out.println("Reverse: "+res);
		if(res==input) {
			return true;
		}
		
		return false;
	}

}
