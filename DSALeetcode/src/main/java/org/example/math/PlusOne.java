package org.example.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
       int[] arr={9};
       arr=plusOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] plusOne(int[] digits) {
int sum=0;
        for (int i = 0; i < digits.length; i++) {

sum=(sum*10)+digits[i];

        }
        sum++;


int size=String.valueOf(sum).length();
  char value[]= String.valueOf(sum).toCharArray();
int arr[]=new int[value.length];

        for (int i = 0; i < value.length; i++) {
           arr[i]=Integer.parseInt(String.valueOf(value[i]));
        }

return arr;
    }

}
