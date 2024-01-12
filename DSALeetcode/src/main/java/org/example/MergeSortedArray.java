package org.example;

import java.util.*;

public class MergeSortedArray {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {

            int index1 = m - 1;
            int index2 = n - 1;
            int mergeIndex = m + n - 1;
while(index1>=0 && index2>=0) {
    if (nums1[index1] > nums2[index2]) {
        nums1[mergeIndex] = nums1[index1];
        index1--;
    } else {
        nums1[mergeIndex] = nums2[index2];
        index2--;
    }
    mergeIndex--;
}
            while (index2 >= 0) {
                nums1[mergeIndex] = nums2[index2];
                index2--;
                mergeIndex--;
            }


            for (int num : nums1) {
                System.out.print(num + " ");
            }
        }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

    }
}
