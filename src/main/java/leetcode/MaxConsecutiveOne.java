package leetcode;

public class MaxConsecutiveOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int currmax=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                currmax++;
            }
            else {
                max=Math.max(max,currmax);
                currmax=0;
            }

        }
        max=Math.max(max,currmax);

        return max;

    }
}
