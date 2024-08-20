package org.example;

public class ContainsDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
boolean flag=false;
        int low=0;
        int high=nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]== nums[j] && Math.abs(i - j) <= k){
                    flag=true;
                }
                else if(nums[i]== nums[j] && Math.abs(i - j) > k){
                    return false;
                }
            }
        }
        if(flag){
            return true;
            }else{
                return false;
            }

    }
    public static void main(String[] args) {
        int num[]={1,0,1,1};
        int k=1;
        System.out.println(containsNearbyDuplicate(num,k));
    }
}
