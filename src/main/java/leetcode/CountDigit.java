package leetcode;
/*
Given a number n. Count the number of digits in n which evenly divide n.
 Return an integer, total number of digits of n which divides n evenly.
 */

public class CountDigit {

    public static void main(String[] args) {
        int  num=918229;
        int temp=num;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        System.out.println("Number of Digits in the number "+ count);
    }
}
