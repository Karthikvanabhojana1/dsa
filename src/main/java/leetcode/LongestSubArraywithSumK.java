package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraywithSumK {
    public static void main(String[] args) {


    int[] A = {-13, 0 ,6 ,15, 16, 2, 15, -12, 17 ,-16, 0, -3, 19, -3, 2 ,-9, -6,};
     // Example array
    int K = 15;  // Example target sum

    // Call the method to find the maximum length subarray
    int result = lenOfLongSubarr(A, A.length, K);

    // Output the result
        System.out.println("The maximum length of the subarray with sum "+K +" is: "+result);
}



public static int lenOfLongSubarr(int A[], int N, int K) {
    Map<Integer, Integer> summap = new HashMap<>();
    int sum = 0;
    int maxLength = 0;

    for (int i = 0; i < A.length; i++) {
        sum += A[i];

        // Check if the sum itself equals K
        if (sum == K) {
            maxLength = i + 1;
        }

        // Calculate remainder and check if we've seen this sum before
        int rem = sum - K;
        if (summap.containsKey(rem)) {
            int L = i - summap.get(rem);
            maxLength = Math.max(maxLength, L);
        }

        // If sum is not already in the map, put it with the current index
        if (!summap.containsKey(sum)) {
            summap.put(sum, i);
        }

        }    return maxLength;


}


}
