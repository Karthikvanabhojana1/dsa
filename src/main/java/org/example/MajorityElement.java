package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> maplist=new HashMap<>();
int max=0;
int maxValue=0;

        for (int i = 0; i < nums.length; i++) {
               int check=maplist.getOrDefault(nums[i],0);
               maplist.put(nums[i],++check);
        }
        for (Map.Entry<Integer, Integer> entry : maplist.entrySet()) {
           if (entry.getValue()>max){
               max=entry.getValue();
               maxValue=entry.getKey();
           }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,2,1,1,1,2,2};


        int value = majorityElement(nums1);
        System.out.println(value);
    }
}
