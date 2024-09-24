package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map=new HashMap<>();
        int length=nums.length;
        for (int i = 0; i < nums.length; i++) {
            int rem=target-nums[i];
            if (map.containsKey(nums[i])){
                return new int[]{i,map.get(nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[]{};


    }
}
