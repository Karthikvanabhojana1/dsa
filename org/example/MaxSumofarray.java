package org.example;

public class MaxSumofarray {
    public static void main(String[] args) {
        int arr[] = {-5,1,-2,3,-1,2,-2};

        System.out.println(maxsum(arr));
    }

    private static int maxsum(int[] arr) {
        int res=arr[0];
        int maxelement=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            maxelement=Math.max(maxelement+arr[i],arr[i]);
            res=Math.max(maxelement,res);
        }
        return res;

    }
}
