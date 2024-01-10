package com.karthik;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Input value to count digit");
  int input=sc.nextInt();
  
  
  int res=countdigit(input);
  
  System.out.println(res);
  
	}

	private static int countdigit(int x) {
		// TODO Auto-generated method stub
		int res=0;
		
		while(x>0) {
			x=x/10;
			res++;
		}
		return res;
	}

}
