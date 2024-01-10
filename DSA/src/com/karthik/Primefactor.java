package com.karthik;

import java.util.Scanner;

public class Primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);

			 System.out.println("Input value to count digit");
			  int input=sc.nextInt();
			  
			  
			  primefactor(input);
	}

	private static void primefactor(int input) {
		// TODO Auto-generated method stub
		if(input<=1) return;
		
		for(int i=2 ; i*i<=input;i++) {
			while(input%i==0) {
				System.out.println(i);
				input=input/i;
			}
		}
		if(input>1) {
			System.out.println(input);
		}
	}
	
	

}
