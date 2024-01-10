package com.karthik;

import java.util.Scanner;

public class TrailingZerosAfterFactorial {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Input value to count digit");
	  int input=sc.nextInt();
	  
	  
	  int res=trailingzeros(input);
	  
	  System.out.println(res);

}

private static int trailingzeros(int input) {
	// TODO Auto-generated method stub
	
	int res=0;
	for(int i=5; i<=input;i=i*5) {
		res=res+input/i;
		
	}
	return res;
}

}
