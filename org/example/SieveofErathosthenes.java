package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class SieveofErathosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc=new Scanner(System.in);

		 System.out.println("Input value to Number");
		  int input=sc.nextInt();
		  
		  
		  isSieve(input);
	}

	static void isSieve(int n)
	{
		if(n <= 1)
			return;
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);

		for(int i=2; i*i <= n; i++)
		{
			if(isPrime[i])
			{
				for(int j = 2*i; j <= n; j = j+i)
				{
					isPrime[j] = false;
				}
			}
		}

		for(int i = 2; i<=n; i++)
		{
			if(isPrime[i])
				System.out.print(i+" ");
		}
	}

}
