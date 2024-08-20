package org.example.stack.from.queue;

import java.util.Arrays;

public class FindElementfromUnsorted {
    public static void main(String[] args) {

int arr[]={4,5,6,7,0,1,2};
int target=0;
        System.out.println(search(arr,target));
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        while(left<=right){
            mid = left+(right-left)/2;
            if(nums[mid] == target) return mid;
            // condition for left side is sort
            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target <=nums[mid]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }
            else{
                if(target>=nums[mid] && target <=nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;


    }
}

