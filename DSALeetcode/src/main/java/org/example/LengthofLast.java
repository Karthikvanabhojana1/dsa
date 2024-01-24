package org.example;

public class LengthofLast {
    public static void main(String[] args) {
        String  s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String[] splitValues = s.split(" ");
        return splitValues[splitValues.length].length();

    }
}
