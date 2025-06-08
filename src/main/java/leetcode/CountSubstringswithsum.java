package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountSubstringswithsum {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 1, 6, 9};
        int k = 9;
        int res = 0;
        List<Integer> set = new ArrayList<>();

        res=func(res, set, 0, nums, k, 0);
        System.out.println(res);
    }

    private static int func(int res, List<Integer> set, int index, int[] nums, int k, int total) {
        if (total == k) {
            res++;
            return res;

        }
        if (total > k || index >= nums.length) {
            return res;
        }
        int sum=total+nums[index];

        set.add(nums[index]);

         res =func(res, set, index + 1, nums, k, sum);

        sum=sum- set.getLast();
        set.removeLast();
         return func(res, set, index + 1, nums, k, sum);
    }
}
