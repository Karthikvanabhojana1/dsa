package org.example;

import java.sql.Array;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
       int count=0;
for (int i=0;i<nums.length;i++) {
    if(!(val==nums[i])){
        nums[count]=nums[i];
        count++;
    }
}

        for (int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }

            return count;

    }
    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int m = 2;


        int value =removeElement(nums1, m );
    }

}
