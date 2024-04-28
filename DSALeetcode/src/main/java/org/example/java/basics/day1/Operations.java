package org.example.java.basics.day1;

public class Operations {
    public static void main(String[] args) {
        int num1=60;
        int num2=50;

        //mathamatical Operation
        System.out.println("Additions "+(num2+num1));
        System.out.println("Subtraction "+(num2-num1));
        System.out.println("multiplication "+(num2*num1));
        System.out.println("Quotient "+(num2/num1));
        System.out.println("Remainder "+(num2%num1));


        //increment

        //post incremnt
        int post=num1++;
        System.out.println("Post incremnt value post "+post);
        System.out.println("Post incremnt value num1 "+num1);
        //preincremnt
        int pre=++num2;


        System.out.println("pre incremnt value pre "+pre);
        System.out.println("pre incremnt value num2 "+num2);
        //post increment
        int postdecrement=num1--;
        System.out.println("Post decrement value postdecrement "+postdecrement);
        System.out.println("Post decrement value num1 "+num1);
        //predecremnt

        int predecrement=--num2;


        System.out.println("pre decrement value predecrement "+predecrement);
        System.out.println("pre decrement value num2 "+num2);

        // adding number and initialization
        num2+=9;
        System.out.println(num2);
    }
}
