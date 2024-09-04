package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AreaValue {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
   /* public int maxArea(int[] height) {
        int maxval1[]=checkmax(height);

        int max=maxval1[0];
        int maxloc=maxval1[1];


        int maxprod=product(max,maxloc,height);

        return maxprod;
    }
    private static int product(int max, int maxloc, int[] height) {
        int maxproduct=0;
        for (int i = 0; i < height.length ; i++) {
            if(maxloc!=i){
                int diff=Math.min(max,height[i]);
                int length=Math.abs(maxloc-i);
                int prod=diff*length;
                if(prod>maxproduct);
                maxproduct=prod;
            }

        }
        return maxproduct;
    }
    private static int[] checkmax(int[] height) {
        int maxval1[]=new int[2];

        int i;

        int max = height[0];
        maxval1[0]=height[0];
        maxval1[1]=0;
        for (i = 1; i < height.length; i++)
            if (height[i] > max){
                max = height[i];
                maxval1[0]=max;
                maxval1[1]=i;

            }



        return maxval1;
    }*/
    public static void main(String[] args) {
        int height[] = {1,2,1};
        System.out.println(maxArea(height));
    }
}
