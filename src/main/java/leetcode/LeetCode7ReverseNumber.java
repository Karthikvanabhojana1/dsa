package leetcode;

import java.util.Scanner;

/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class LeetCode7ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Reverse of the GivenNumber is :"+reverse(num));

    }
    public static int reverse(int x) {
        int temp = x;
        long rev=0;
        while (temp!=0){
            int rem=temp%10;
            rev=(rev*10)+rem;
            if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
                return 0;
            }
            temp=temp/10;
        }
        return (int) rev;
    }
}
