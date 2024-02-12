package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConsecutiveNumbersinArray {


    public static void main(String[] args) {
        int arr[]={1,2,0,1};
        System.out.println(longestConsecutive(arr));

    }
    public static int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        Map<Integer, Integer> consecelements=new HashMap<>();
        if(nums.length==0) {
            return 0;
        }
        int max=1;
int count=1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]-nums[i]==1){
                count++;
            }
            else if(nums[i+1]-nums[i]==0){
                continue;
            }
            else {
                if(max<count){
                    max=count;
                }
                count=1;

            }
        }
        if(max<count){
            max=count;
        }
        return max;

    }
}
