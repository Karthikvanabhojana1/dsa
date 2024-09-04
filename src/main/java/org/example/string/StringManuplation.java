package org.example.string;

import java.util.Arrays;

public class StringManuplation {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(isuniquesolution(str));
    }

    private static boolean isunique(String str) {
        char[] character=new char[str.length()];

        for (int i = 0; i <str.length() ; i++) {

            character[i]=str.charAt(i);
        }
        Arrays.sort(character);
        for (int i = 1; i < character.length; i++) {
            if(character[i-1]==character[i]){
                return false;
            }
        }
        return true;

    }
    private static boolean isuniquesolution(String str) {
        boolean[] character=new boolean[128];

        for (int i = 0; i <str.length() ; i++) {
            int val= str.charAt(i);
            if(character[val]==true){
                return false;
            }
            character[val]=true;

        }
return true;

    }



}
