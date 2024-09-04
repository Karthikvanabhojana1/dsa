package org.example;

public class Divide {
    public static int divide(int dividend, int divisor) {
        int temp=0;
        if(dividend==0){
            return 0;
        }

        else if((dividend<=0 || divisor<=0) && dividend%divisor>0 ){
             temp=Math.floorDiv(dividend, divisor);
            temp=temp+1;


        }
        else {
            temp=Math.floorDiv(dividend, divisor);
        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.println(divide(10,3));
    }

}
