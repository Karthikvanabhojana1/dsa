package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateNonContineousSubSequencewithSum {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 1, 6, 9};
        int k = 9;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();

        func(res, set, 0, nums, k, 0);
        System.out.println(res);
    }

    private static void func(List<List<Integer>> res, List<Integer> set, int index, int[] nums, int k, int total) {
        if (total == k) {
            res.add(new ArrayList<>(set));
            return;
        }
        if (total > k || index >= nums.length) {
            return;
        }
        int sum=total+nums[index];

        set.add(nums[index]);
        func(res, set, index + 1, nums, k, sum);

         sum=sum- set.getLast();
        set.removeLast();
        func(res, set, index + 1, nums, k, sum);
    }
}
