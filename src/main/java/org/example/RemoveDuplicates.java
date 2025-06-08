package org.example;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int count=1;
        for (int i=0;i<nums.length-1;i++) {
            if((nums[i+1]!=nums[i])){
                nums[count]=nums[i+1];
                count++;
            }
        }

        for (int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,1,2};


        int value =removeDuplicates(nums1);
    }
}
