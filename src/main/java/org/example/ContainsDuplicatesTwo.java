package org.example;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatesTwo {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4,0,0,7,8,9,10,11,12,0}, k = 1;

        System.out.println(containsNearbyDuplicate(nums,k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag=false;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                if(map.size()>0){
                    flag=true;
                }
                map.put(nums[i],i);
            }
            else{
                if(Math.abs(map.get(nums[i])-i)>k){
                    flag=false;
                    map.put(nums[i],i);
                }
                else {
                    flag=true;

                }
            }

        }

return flag;

    }
}
