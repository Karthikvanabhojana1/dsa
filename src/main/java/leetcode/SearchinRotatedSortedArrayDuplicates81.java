package leetcode;

public class SearchinRotatedSortedArrayDuplicates81 {
    public boolean search(int[] nums, int target) {
        int num=nums.length;
        int start=0;
        int end=num-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target) return true;
            if(nums[start]==nums[end] && nums[end]!=target){
                start++;
                end--;
                continue;
            }
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<=nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[end]){
                    start=mid+1;

                }
                else{
                    end=mid-1;

                }
            }
        }
        return false;
    }
}
