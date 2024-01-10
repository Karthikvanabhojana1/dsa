package com.karthik;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[6];
arr[0]=4;
arr[1]=84;
arr[2]=784;
arr[3]=477;
arr[4]=46;
arr[5]=56;
//System.out.println(arr[4]);

for(int i:arr) {
	System.out.println(i);
}

Scanner in=new Scanner(System.in);
System.out.println(Arrays.toString(arr));
String[] arrString=new String[5];
for(int i=0; i < arrString.length ;i++ ) {
	arrString[i]=in.next();
}
System.out.println(Arrays.toString(arrString));

	}
	
	

}
