package psa.clas;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static List<List<Integer>> getsubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        loop(nums, 0, new ArrayList<>(), result);
        return result;
    }

        private static void loop(int[] nums, int start, List<Integer> subset, List<List<Integer>> result) {
        result.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            loop(nums, i + 1, subset, result);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = getsubsets(nums);
        for (List<Integer> subset : allSubsets) {
            System.out.println(subset);
        }
    }
}
