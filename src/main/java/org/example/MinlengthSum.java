package org.example;

public class MinlengthSum {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int len = 0;
        int ans = n + 1;
        int i = 0;
        int j = 0;

        while (j < n) {
            sum += nums[j];
            while (sum >= target) {
                len = j - i + 1;
                ans = Math.min(ans, len);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return (ans == n + 1) ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 2, 4, 3};
        int num = 7;
        System.out.println(minSubArrayLen(num, a));
    }
}
