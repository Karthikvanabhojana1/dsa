package org.example;

import java.util.Scanner;

public class ComputingPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc=new Scanner(System.in);


		 System.out.println("Input value to count digit");
		  int a=sc.nextInt();
		  
		  int b=sc.nextInt();

		  
		  int res=power(a,b);
		  
		  System.out.println(res);
	

	}

	private static int power(int a, int b) {
		// TODO Auto-generated method stub
		
		if(b==0) {
			return 1;
		}
		int temp=power(a,b/2);
		temp=temp*temp;
		if(b%2==0)
			return temp;
		else
		return temp*a;
	}

}
