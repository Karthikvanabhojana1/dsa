package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateNonContineousSubSequence {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 1, 6, 9};
        List<Set<Integer>> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        func(res, set, 0, nums);
        System.out.println(res);
    }

    private static void func(List<Set<Integer>> res, Set<Integer> set, int index, int[] nums) {
        if (index >= nums.length) {
            // Add a new copy of the set to the result list
            res.add(new HashSet<>(set));
            return;
        }

        // Include the current element
        set.add(nums[index]);
        func(res, set, index + 1, nums);

        // Exclude the current element
        set.remove(nums[index]); // Use value, not index
        func(res, set, index + 1, nums);
    }
}

