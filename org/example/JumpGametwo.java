package org.example;

public class JumpGametwo {
//    public static int jump(int[] nums) {
//
public static int jump(int[] nums) {
    int jumps = 0, currEnd = 0, currFarthest = 0;
    for(int i = 0; i < nums.length - 1; i ++) {
        currFarthest = Math.max(currFarthest, i + nums[i]);
        if(i == currEnd) {
            currEnd = currFarthest;
            jumps ++;
        }
    }
    return jumps;
}
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        int result = jump(nums);
        System.out.println(result); // Output: false
        int[] nums1 = {2,3,1,1,4};
        int result1 = jump(nums1);
        System.out.println(result1+ " Output"); // Output: true
        int[] nums3 = {1,0};
        int result2 = jump(nums3);
        System.out.println(result2); // Output: true
        int[] nums4 = { 1,2,1,1,1};
        int  result3 = jump(nums4);
        System.out.println(result3); // Output: true
    }
}
