package leetcode;

import java.util.Scanner;
/*
Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class Leetcode9 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Is the number palindrome:"+palindrome(num));

    }
    public static boolean palindrome(int x) {
        int temp = x;
        long rev=0;
        if (x<0)
            return false;
        while (temp!=0){
            int rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }
        return rev==x;
    }

}
