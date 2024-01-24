package org.example;

public class SumMinSubArray {
    public static void main(String[] args) {
        int a[]={3,1,2,4};
        System.out.println(sumSubarrayMins(a));
    }
    public static int sumSubarrayMins(int[] arr) {


        int sum=0;
//        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int min=Integer.MAX_VALUE;
//sum=arr[i]+sum;
            for (int j = i; j <arr.length; j++) {
                for (int k = i; k <=j; k++) {
                    min= Math.min(min,arr[k]);

                }
                sum=sum+min;

            }


        }
        return sum;
    }
}
