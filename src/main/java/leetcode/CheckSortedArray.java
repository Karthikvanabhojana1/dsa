package leetcode;

public class CheckSortedArray {
    public boolean check(int[] nums) {
        int rotated=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                rotated++;
            }
            if(rotated>1)
                return false;
        }

        return true;
    }
}
