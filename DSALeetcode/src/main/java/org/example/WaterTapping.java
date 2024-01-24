package org.example;

public class WaterTapping {

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(tapwater(arr));
    }

    private static int tapwater(int[] arr) {
        int length = arr.length;

        int res=0;
        int lmax []=new int [length];
        int rmax []=new int [length];
lmax[0]=arr[0];
rmax[length-1]=arr[length-1];
        for (int i = 1; i <length ; i++) {
lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        for (int i = length-2; i >=0 ; i--) {
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        for (int i = 0; i <length ; i++) {
            res=res+(Math.min(lmax[i],rmax[i])-arr[i]);
        }
        return res;

    }

}
