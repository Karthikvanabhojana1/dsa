package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithoutrepeating {
    public int lengthOfLongestSubstring(String s) {
        int right=0;
        int left=0;
        int max=0;
        Map<Character,Integer> map=new HashMap<>();
        while (right<s.length()){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(map.get(s.charAt(right))+1,left);
            }
            max=Math.max(max,right-left+1);
            map.put(s.charAt(right),right);
            right=right+1;

        }
        return max;
    }
}
