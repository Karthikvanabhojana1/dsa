package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumKcount {
    public static void main(String[] args) {


        int[] A = {0,0,0,0,0,0,0,0,0,0};
        // Example array
        int K = 0;  // Example target sum

        // Call the method to find the maximum length subarray
        int result = subarraySum(A, K);

        // Output the result
        System.out.println("The total length of the subarray with sum "+K +" is: "+result);
    }


    public static  int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> summap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        summap.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];


            int rem = sum - k;
            if (summap.containsKey(rem)) {
                maxLength += summap.get(sum-k);
            }
            summap.put(sum, summap.getOrDefault(sum,0)+1);



        }    return maxLength;

    }
}
