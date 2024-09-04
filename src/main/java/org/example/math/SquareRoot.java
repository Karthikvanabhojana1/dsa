package org.example.math;

public class SquareRoot {
    public static void main(String[] args) {
//        System.out.println((int)(Math.floor(Math.sqrt(8))));
        Math.pow(2.1110,3);


        System.out.println(trailingZeroes(30));
    }
    public  static int trailingZeroes(int n) {
int count=0;

        while(n>0){
            n=n/5;
            count++;
        }
        return count;
    }
}
