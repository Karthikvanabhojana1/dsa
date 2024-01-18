package org.example;

import java.util.HashMap;
import java.util.Map;

public class RemoveDulicateMorethantwotimes {

        public static int removeDuplicates(int[] nums) {
            if (nums.length <= 2) {
                return nums.length;
            }

            int count = 2;

            for (int i = 2; i < nums.length; i++) {
                if (nums[i] != nums[count - 2]) {
                    nums[count++] = nums[i];
                }
            }

            for (int i=0;i<nums.length;i++) {
                System.out.println(nums[i]);
            }
            return count;
        }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};


        int value = removeDuplicates(nums1);
    }
}
