package org.example;

import java.util.Arrays;

public class medianofArrays {
    public static void main(String[] args) {
int nums[]={1,2};
int nums1[]={3,4};
        System.out.println(findMedianSortedArrays(nums,nums1));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n1 = nums1.length;
            int n2 = nums2.length;

            int[] arr3 = new int[n1+n2];


            int i=0;
            int j=0;
            int k=0;

            while(i<n1) {
                arr3[k]= nums1[i];
                k++;
                i++;
            }

            while(j<n2) {
                arr3[k]= nums2[j];
                k++;
                j++;
            }
            Arrays.sort(arr3);
            int mid=arr3.length/2;
        System.out.println(mid);
if(arr3.length%2==0){
    return (double) (arr3[mid]+arr3[mid-1])/2;


}
else {
    return (double) arr3[mid];

}
        }

}

