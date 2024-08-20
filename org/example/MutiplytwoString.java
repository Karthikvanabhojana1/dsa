package org.example;

import java.math.BigInteger;

public class MutiplytwoString {
    public static void main(String[] args) {
        System.out.println(multiply("333","333"));

    }
    public static String multiply(String num1, String num2) {
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);

        // Perform the multiplication using BigInteger
        BigInteger result = bigNum1.multiply(bigNum2);

        // Convert the result back to a string and return it
        return result.toString();

    }
}
