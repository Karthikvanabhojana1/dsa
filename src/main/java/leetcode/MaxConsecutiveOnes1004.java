package leetcode;

public class MaxConsecutiveOnes1004 {
    public int longestOnes(int[] nums, int k) {
        int zeros=0,max=0,right=0,left=0;
        while(right<nums.length){
            if(nums[right]==0){
                zeros++;
            }
            if(zeros>k){
                if(nums[left]==0) {
                    zeros--;
                }

                left++;


            }
            if(zeros<=k)
                max=Math.max(max,right-left+1);

            right++;
        }
        return max;
    }
}

