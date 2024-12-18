package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majorityelement2 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> majority =new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>nums.length/3){
                if(!majority.contains(nums[i])) {
                    majority.add(nums[i]);
                }
            }

        }
//        for (int i = 0; i < nums.length; i++) {
//            if(map.get(nums[i])>nums.length/3){
//                if(!majority.contains(nums[i])) {
//                    majority.add(nums[i]);
//                }
//            }
//
//        }
        return majority;

    }
}
