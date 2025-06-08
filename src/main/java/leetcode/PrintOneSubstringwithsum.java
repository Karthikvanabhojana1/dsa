package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintOneSubstringwithsum {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 1, 6, 9};
        int k = 9;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();

        func(res, set, 0, nums, k, 0);
        System.out.println(res);
    }

    private static boolean func(List<List<Integer>> res, List<Integer> set, int index, int[] nums, int k, int total) {
        if (total == k) {
            res.add(new ArrayList<>(set));

            return true;
        }
        if (total > k || index >= nums.length) {
            return false;
        }
        int sum=total+nums[index];

        set.add(nums[index]);

        boolean pick =func(res, set, index + 1, nums, k, sum);
        if(pick){
            return true;
        }
        sum=sum- set.getLast();
        set.removeLast();
        return func(res, set, index + 1, nums, k, sum);
    }
}
