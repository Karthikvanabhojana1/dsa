package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesfromSorted {
    public static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],0);
        }

        for (int i: map.values()) {
            nums[i]= i;
        }
        return map.size();

    }
    public static int removeDuplicatesoptimul(int[] nums) {
        int i=0,j=0;
        while (j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return i+1;

    }

    public static void main(String[] args) {
        System.out.print("");
    }
}
