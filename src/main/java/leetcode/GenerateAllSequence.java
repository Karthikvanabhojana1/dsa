package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateAllSequence {
    List<List<Integer>> result=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        generateSubsets(new ArrayList<>(), nums, 0);
        return result;
    }

    private void generateSubsets(List<Integer> current, int[] nums, int index) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        generateSubsets(current, nums, index + 1);

        current.remove(current.size() - 1);
        generateSubsets(current, nums, index + 1);
    }
}
