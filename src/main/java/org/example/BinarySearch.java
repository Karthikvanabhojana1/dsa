package org.example;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums1 = {10,20,100,230,400};
        int val=230;
        System.out.println(binarysearchele(nums1,val));
    }

    private static int binarysearchele(int[] nums1, int val) {
        int low=0, high=nums1.length-1;
        while ((low<=high))

        {
            int mid=(low+high)/2;

            if(nums1[mid]==val){
                return mid;
            }
            else if(nums1[mid]>val) {
                high=mid-1;

        } else if(nums1[mid]<val) {
                low=mid+1;


            }
        }

        return -1;

    }




}
