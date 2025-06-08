package org.example;

import java.util.Arrays;

public class Jumpgame {
	    public static boolean canJump(int[] nums) {
	       int value = 0;

	       // check if the value is at the end of the array inputed
	        int n = nums.length;

	        for (int i = 0; i < n; i++) {
	        	//check if the index is within the reach
	            if (i > value) {
	                return false;
	            }
	            // Update the maximum maxvalue index

	            value = Math.max(value, i + nums[i]);
	            // If the last value is reached, return true

	            if (value >= n - 1) {
	                return true;
	            }
	        }
//if no condition is satisfied them return false
	        return false;
	    }


	public static void main(String[] args) {
		int[] nums = {3,2,1,0,4};
		boolean result = canJump(nums);
		System.out.println(result); // Output: false
		int[] nums1 = { 2,3,1,1,4};
		boolean result1 = canJump(nums1);
		System.out.println(result1); // Output: true
		int[] nums3 = {1,0};
		boolean result2 = canJump(nums3);
		System.out.println(result2); // Output: true
		int[] nums4 = { 1,2,3 };
		boolean result3 = canJump(nums4);
		System.out.println(result3); // Output: true
	}

}