package leetcode;

public class Startingandendingindexofelement {
    public int[] searchRange(int[] nums, int target) {
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return new int[]{mid, mid+1};

            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{1, 1};

    }
}
