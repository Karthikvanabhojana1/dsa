package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int longest=1;
        Set<Integer> setnum=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            setnum.add(nums[i]);
        }
        if (setnum.size()==0) return 0;

        if (setnum.size()==1) return 1;

        for (int num:setnum){

            if(!setnum.contains(num-1)){
                int x=num;
                int count=1;
                while(setnum.contains(x+1) ){
                    count++;
                    x=x+1;
                    longest=Math.max(longest,count);
                }
            }


        }
        return longest;

    }

}
